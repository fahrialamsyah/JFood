package fahrialamsyah.jfood.controller;

import fahrialamsyah.jfood.DatabaseSeller;
import fahrialamsyah.jfood.Location;
import fahrialamsyah.jfood.Seller;
import fahrialamsyah.jfood.SellerNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

@RequestMapping("/seller")
@RestController
public class SellerController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Seller> getAllSeller(){

        return DatabaseSeller.getSellerDatabase();
    }

    @RequestMapping("{id}")
    public Seller getSellerById(@PathVariable int id) {
        Seller seller;
        try {
            seller = DatabaseSeller.getSellerById(id);
            return seller;
        } catch (SellerNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Seller addSeller(@RequestParam(value = "name") String name,
                            @RequestParam(value = "email") String email,
                            @RequestParam(value = "phoneNumber") String phoneNumber,
                            @RequestParam(value = "province") String province,
                            @RequestParam(value = "description") String description,
                            @RequestParam(value = "city") String city) {

        if (DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId() + 1, name, email, phoneNumber, new Location(city, province, description))))
        {
            Seller temp;
            try {
                temp = DatabaseSeller.getSellerById(DatabaseSeller.getLastId());
                return temp;
            } catch (SellerNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
        return null;
    }
}
