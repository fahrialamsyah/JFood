package fahrialamsyah.jfood.controller;

import fahrialamsyah.jfood.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/food")
@RestController
public class FoodController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Food> getAllFood() {
        return DatabaseFood.getFoodDatabase();
    }

    @RequestMapping("/{id}")
    public Food getFoodById(@PathVariable int id) {
        Food temp;
        try{
            temp = DatabaseFood.getFoodById(id);
            return temp;
        } catch (FoodNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping("/seller/{sellerid}")
    public ArrayList<Food> getFoodBySeller(@PathVariable int sellerid){
        return DatabaseFood.getFoodBySeller(sellerid);
    }

    @RequestMapping("/category/{category}")
    public ArrayList<Food> getFoodByCategory(@PathVariable FoodCategory category) {
        return DatabaseFood.getFoodByCategory(category);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Food addFood(@RequestParam(value = "name") String name,
                        @RequestParam(value = "price") int price,
                        @RequestParam(value = "category") FoodCategory category,
                        @RequestParam(value = "sellerId") int sellerid) {
        Seller seller;
        try {
            seller = DatabaseSeller.getSellerById(sellerid);
            if (DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, name,
                    seller, price, category))) {
                Food temp;
                try {
                    temp = DatabaseFood.getFoodById(DatabaseFood.getLastId());
                    return temp;
                } catch (FoodNotFoundException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (SellerNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
