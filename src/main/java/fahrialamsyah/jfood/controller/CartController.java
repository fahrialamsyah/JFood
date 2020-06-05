package fahrialamsyah.jfood.controller;

import fahrialamsyah.jfood.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
/**
 * <h1>Cart Controller<h1>
 * Kelas ini berfungsi untuk menjadi wadah untuk controller cart API android
 *
 * @author Fahri Alamsyah
 * @version 30 - 05 - 2020
 *
 */

@RequestMapping("/cart")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class CartController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<FoodCart> getAllCart(){
        ArrayList<FoodCart> ret;
        ret = DatabaseCart.getCartDatabase();
        return ret;
    }

    @RequestMapping(value = "/customer/{customerId}", method = RequestMethod.GET)
    public ArrayList<FoodCart> getCartByCustomer(@PathVariable int customerId){
        try {
            return DatabaseCart.getCartByCustomer(customerId);
        }catch (CustomerNotFoundException e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @RequestMapping(value ="/customer/delete/{customerId}", method = RequestMethod.DELETE)
    public boolean removeCart(@PathVariable int customerId){
        try{
            if (DatabaseCart.removeCart(customerId)) {
                return true;
            }
        }catch (CustomerNotFoundException e){
            System.out.println(e.getMessage());

        }
        return false;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public FoodCart addCart (@RequestParam(value = "customerId") int customerId,
                             @RequestParam(value = "name") String name,
                             @RequestParam(value = "id") int id,
                             @RequestParam(value = "price") int price,
                             @RequestParam(value = "quantity")int quantity)
    {
        FoodCart cart;
        cart = new FoodCart(DatabaseCustomerPostgreBaru.getCustomer(customerId), id, name, price, quantity);
        DatabaseCart.addCart(cart);
        return cart;
    }

}
