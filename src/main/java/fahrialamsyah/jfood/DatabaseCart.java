package fahrialamsyah.jfood;

import java.util.ArrayList;

/**
 * <h1>Database Cart<h1>
 * Kelas ini berfungsi untuk menjadi wadah untuk menampung menu makanan ke suatu variable Cart
 *
 * @author Fahri Alamsyah
 * @version 30- 05 -2020
 *
 */

public class DatabaseCart {

    private static ArrayList<FoodCart> CART_DATABASE = new ArrayList<>();
    private static int LastId = 0;

    /**
     * this method is getter for every Cart in Cart's database
     * @return ArrayList<FoodCart> is the array list of every foodCart in the Cart's database
     */
    public static ArrayList<FoodCart> getCartDatabase() {
        return CART_DATABASE;
    }

    /**
     * this method is to get the id of the last id foodCart added to Cart's database
     * @return an integer of the last cart's id
     */

    public static int getLastId() {
        return LastId;
    }

    /**
     * this method is to get every foodcart under one customer
     * @param CustomerId is the customer's id for the expected array list foodcart that the customer buy
     * @return an ArrayList of FoodCart object that the customer buy
     */

    public static ArrayList<FoodCart> getCartByCustomer (int CustomerId) throws CustomerNotFoundException{
        ArrayList<FoodCart> ret = new ArrayList<>();
        for(FoodCart cart : CART_DATABASE){
            if (cart.getCustomer().getId() == CustomerId){
                ret.add(cart);
            }else {
                throw new CustomerNotFoundException(CustomerId);
            }
        }
        return ret;
    }

    /**
     * this method is to add foodcart to the array list in the DatabaseCart that hold every foodcart buying by customer
     * @param cart is a cart class object that wanted to be added to the DatabaseCart class array list
     * @return a boolean, true if the cart is successfully added
     */
    public static boolean addCart (FoodCart cart){
        if(CART_DATABASE.add(cart)){
            LastId = cart.getFoodId();
            return true;
        }
        return false;
    }

    /**
     * this method is to remove cart from database array list by specifying it's customer id
     * @param customerId is the buying foodcart's id for the expected food object this method returns
     * @return a FoodCart class object in respect of the id specified in the parameter
     * @throws CustomerNotFoundException to check whether the customer buying foodcart that goes by the id in the parameter exist or not
     */

    public static boolean removeCart (int customerId) throws CustomerNotFoundException{
        for(FoodCart cart : CART_DATABASE) {
            if (cart != null) {
                if(cart.getCustomer().getId() == customerId) {
                    CART_DATABASE.clear();
                    return true;
                }
            }else {
                return false;
            }
        }
        throw new CustomerNotFoundException(customerId);
    }

}
