package fahrialamsyah.jfood.controller;

import fahrialamsyah.jfood.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
/**
 * Write a description of class Seller Controller JFood here.
 *
 * @author Fahri Alamsyah
 * @version 30 - 05 -2020
 */
@RequestMapping("/seller")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class SellerController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Seller> getAllSeller (){
        ArrayList<Seller> ret;
        ret = DatabaseSeller.getSellerDatabase();
        return ret;
    }

    @RequestMapping(value="{id}", method = RequestMethod.GET)
    public Seller getSellerById (@PathVariable int id){
        Seller seller = null;
        try{
            seller = DatabaseSeller.getSellerById(id);
        }catch (SellerNotFoundException e){
            System.out.println(e.getMessage());
            return null;
        }
        return seller;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Seller addSeller (@RequestParam(value = "name")String name,
                             @RequestParam(value = "email")String email,
                             @RequestParam(value = "phoneNumber")String phoneNumber,
                             @RequestParam(value = "province")String province,
                             @RequestParam(value = "description")String description,
                             @RequestParam(value = "city")String city)
    {
        Location location = new Location(province, description, city);
        Seller seller = new Seller(DatabaseSeller.getLastId()+1, name, email, phoneNumber, location);
        DatabaseSeller.addSeller(seller);
        return seller;
    }


}

