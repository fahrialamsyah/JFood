package fahrialamsyah.jfood.controller;

import fahrialamsyah.jfood.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

public class PromoController
{
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ArrayList<Promo> getAllPromo(@PathVariable int id) {
        return DatabasePromo.getPromoDatabase();
    }

    @RequestMapping(value = "/promo/{code}", method = RequestMethod.GET)
    public Promo getPromoByCode(@PathVariable String code) throws PromoNotFoundException {
        Promo promo = DatabasePromo.getPromoByCode(code);
        return promo;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Promo addPromo(@RequestParam(value="code") String code,
                          @RequestParam(value="discount") int discount,
                          @RequestParam(value="minPrice") int minPrice,
                          @RequestParam(value="active") Boolean active) {

        Promo promo = null;
        try {
            promo = new Promo (DatabaseSeller.getLastId()+1, code, discount, minPrice, active);
            DatabasePromo.addPromo(promo);
        } catch (PromoCodeAlreadyExistsException p) {
            System.out.println(p.getMessage());
            return null;
        }
        return promo;
    }
}