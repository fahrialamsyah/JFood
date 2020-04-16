package fahrialamsyah.jfood.controller;
import fahrialamsyah.jfood.*;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;

public class SellerController
{
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ArrayList<Seller> getAllSeller(@PathVariable int id) {
        return DatabaseSeller.getSellerDatabase();
    }

    @RequestMapping(value = "/seller/{id}", method = RequestMethod.GET)
    public Seller getSellerById(@PathVariable int id) throws SellerNotFoundException {
        Seller seller = DatabaseSeller.getSellerById(id);
        return seller;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Seller addSeller(@RequestParam(value="name") String name,
                            @RequestParam(value="email") String email,
                            @RequestParam(value="phoneNumber") String phoneNumber,
                            @RequestParam(value="province") String province,
                            @RequestParam(value="description") String description,
                            @RequestParam(value="city") String city) {

        Seller seller = new Seller (DatabaseSeller.getLastId()+1, name, email, phoneNumber, new Location(city, province, description));
        if(DatabaseSeller.addSeller(seller)) {
            return seller;
        }
        return null;
    }
}