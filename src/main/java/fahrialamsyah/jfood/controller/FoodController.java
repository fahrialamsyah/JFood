package fahrialamsyah.jfood.controller;

import fahrialamsyah.jfood.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
/**
 * Write a description of class Food Controller JFood here.
 *
 * @author Fahri Alamsyah
 * @version 16 - 04 -2020
 */
@RequestMapping("/food")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class FoodController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Food> getAllFood(){
        ArrayList<Food> ret;
        ret = DatabaseFood.getFoodDatabase();
        return ret;
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Food getFoodById(@PathVariable int id) {
        Food food = null;
        try {
            food = DatabaseFood.getFoodById(id);
        }catch (FoodNotFoundException e){
            System.out.println(e.getMessage());
        }
        return food;
    }

    @RequestMapping(value = "/seller/{sellerId}", method = RequestMethod.GET)
    public ArrayList<Food> getFoodBySeller(@PathVariable int sellerId){
        try{
            return DatabaseFood.getFoodBySeller(sellerId);
        } catch (SellerNotFoundException e) {
            System.out.println(e.getMessage());
            return null;
        }

    }

    @RequestMapping(value = "category/{category}", method = RequestMethod.GET)
    public ArrayList<Food> getFoodByCategory(@PathVariable FoodCategory category){
        ArrayList<Food> ret;
        ret = DatabaseFood.getFoodByCategory(category);
        return ret;
    }


    @RequestMapping(value="", method = RequestMethod.POST)
    public Food addFood(@RequestParam(value="Name")String name,
                        @RequestParam(value="price")int price,
                        @RequestParam(value="Category")FoodCategory category,
                        @RequestParam(value="sellerId")int sellerId)  {
        Food food;
        try{
            food = new Food(DatabaseFood.getLastid()+1, name, DatabaseSeller.getSellerById(sellerId), price, category);
        }catch (SellerNotFoundException e){
            System.out.println(e.getMessage());
            return null;
        }
        DatabaseFood.addFood(food);
        return food;
    }
}
