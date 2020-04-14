package fahrialamsyah.jfood;
import java.util.GregorianCalendar;

/**
 * Write a description of class Food here.
 *
 * @author Fahri Alamsyah
 * @version 09 - 04 - 2020
 */
public class Food
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private int price;
    private Seller seller;
    private FoodCategory category;

    /**
     * Constructor for objects of class Food
     */
    public Food(int id, String name, Seller seller, int price, FoodCategory category)
    {
        // initialise instance variables
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.seller = seller;
    }



    /**
     * Use this method to get the seller of a food. The data will be returned as an object of Seller class
     * @return Seller
     */
    public Seller getSeller(){
        return this.seller;
    }



    /**
     * Use this method to get id of the food.
     * @return int
     */
    public int getId(){
        return this.id;
    }



    /**
     * Use this method to get the name of the get the name of the food.
     * @return String
     */
    public String getName(){
        return this.name;
    }



    /** int
     * Use this method to get the price of a food
     * @return int
     */
    public int getPrice(){
        return this.price;
    }



    /**
     * Use this method to get the category of certain food.
     * @return String
     */
    public FoodCategory getCategory(){
        return this.category;
    }



    /**
     * Use this method to set the id of a food.
     * @param id
     */
    public void setId(int id){
        this.id = id;
    }


    /**
     * Use this method to set the name of a food
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }


    /**
     * Use this method to set the price
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }


    /**
     * Use this method to set the category of a food
     * @param category
     */
    public void setCategory(FoodCategory category) {
        this.category = category;
    }


    /**
     * Use this method to the seller by passing the seller of object to parameter of the method.
     * @param seller
     */
    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public String toString(){

        return "Id: " + id + "\n" +
                "Nama: " + name + "\n" +
                "Seller: " + seller.getName() + "\n" +
                "City: " + seller.getLocation().getCity() + "\n" +
                "Price: " + price + "\n" +
                "Category: " + category.toString();
    }


}
