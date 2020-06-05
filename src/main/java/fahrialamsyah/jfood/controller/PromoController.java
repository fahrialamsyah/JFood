package fahrialamsyah.jfood.controller;

import fahrialamsyah.jfood.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
/**
 * Write a description of class Promo Controller JFood here.
 *
 * @author Fahri Alamsyah
 * @version 30 - 05 -2020
 */
@RequestMapping("/promo")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController

public class PromoController {
    @RequestMapping("")
    public String indexPage(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello" + name;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Promo> getAllPromo (){
        ArrayList<Promo> ret;
        ret = DatabasePromo.getPromoDatabase();
        return ret;
    }

    @RequestMapping(value="{code}", method = RequestMethod.GET)
    public Promo getPromoByCode(@PathVariable String code){
        Promo promo = null;
        promo = DatabasePromo.getPromoByCode(code);
        return promo;
    }

    @RequestMapping (value ="", method = RequestMethod.POST)
    public Promo addPromo(@RequestParam(value="code") String code,
                          @RequestParam(value="discount") int discount,
                          @RequestParam(value ="minPrice") int minPrice,
                          @RequestParam(value ="active") Boolean active)
    {
        try
        {
            Promo promo = new Promo (DatabasePromo.getLastId()+1, code, discount, minPrice, active);
            DatabasePromo.addPromo(promo);
            return promo;
        }catch (PromoCodeAlreadyExistsException e){
            System.out.println(e.getMessage());
            return null;
        }
    }



}

