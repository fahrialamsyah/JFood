package fahrialamsyah.jfood.controller;

import fahrialamsyah.jfood.DatabasePromo;
import fahrialamsyah.jfood.Promo;
import fahrialamsyah.jfood.PromoCodeAlreadyExistsException;
import fahrialamsyah.jfood.PromoNotFoundException;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.RequestingUserName;
import javax.sound.midi.SysexMessage;
import java.util.ArrayList;

@RequestMapping("/promo")
@RestController
public class PromoController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Promo> getAllPromo(){
        return DatabasePromo.getPromoDatabase();
    }

    @RequestMapping("/{code}")
    public Promo getPromoByCode(@PathVariable String code){
        Promo temp;
        temp = DatabasePromo.getPromoByCode(code);
        return temp;
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    public Promo addPromo(@RequestParam(value = "code") String code,
                          @RequestParam(value = "discount") int discount,
                          @RequestParam(value = "minPrice") int minPrice,
                          @RequestParam(value = "active") boolean active) {
        try {
            if (DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId() + 1, code, discount, minPrice, active))) {
                Promo promo;
                try {
                    promo = DatabasePromo.getPromoById(DatabasePromo.getLastId());
                    return promo;
                } catch (PromoNotFoundException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (PromoCodeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
