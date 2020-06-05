package fahrialamsyah.jfood;

import java.util.ArrayList;

/**
 * <h1>Database Food<h1>
 * Kelas ini berfungsi untuk menjadi wadah untuk menampung menu makanan ke suatu variable
 * list yaitu listFood
 *
 * @author Fahri Alamsyah
 * @version 27-February-2020
 *
 */
public class DatabaseFood
{
    //Atribut yang digunakan pada kelas ini dengan access modifier privaten
    private static ArrayList<Food> FOOD_DATABASE = new ArrayList<>();
    private static int lastid = 0;

    /**
     * this method is getter for every food in food's database
     * @return ArrayList<Food> is the array list of every food in the food's database
     */
    public static ArrayList<Food> getFoodDatabase()
    {
        return FOOD_DATABASE;
    }

    /**
     * this method is to get the id of the last food added to food's database
     * @return an integer of the last food's id
     */

    public static int getLastid()
    {
        return lastid;
    }

    /**
     * this method is to get some food by specifying it's id
     * @param id is the food's id for the expected food object this method returns
     * @return a Food class object in respect of the id specified in the parameter
     * @throws FoodNotFoundException to check whether the food that goes by the id in the parameter exist or not
     */
    public static Food getFoodById(int id) throws FoodNotFoundException{
        for(Food food : FOOD_DATABASE) {
            if (food.getId() == id) {
                return food;
            }
        }
        throw new FoodNotFoundException(id);

    }

    /**
     * this method is to get every food under one seller
     * @param sellerId is the seller's id for the expected array list food that the seller sells
     * @return an ArrayList of Food object that the seller sells
     */
    public static ArrayList<Food> getFoodBySeller (int sellerId) throws SellerNotFoundException{
        ArrayList<Food> ret = new ArrayList<>();
        for (Food food: FOOD_DATABASE) {
            if (food.getSeller().getId() == sellerId) {
                ret.add(food);
            }else{
                throw new SellerNotFoundException(sellerId);
            }
        }
        return ret;
    }

    /**
     * this method is to get every food under the specified food category from FoodCategory enum
     * @param category is the expected category for every food's array list returned
     * @return an ArrayList<Food> array list of food that have the category field same as foodCategory specified in the parameter
     */

    public static ArrayList<Food> getFoodByCategory (FoodCategory category) {
        ArrayList<Food> ret = new ArrayList<>();
        for (Food food: FOOD_DATABASE) {
            if (food.getCategory() == category) {
                ret.add(food);
            }
        }
        return ret;
    }

    /**
     * this method is to add food to the array list in the DatabaseFood that hold every food registered
     * @param food is a Food class object that wanted to be added to the DatabaseFood class array list
     * @return a boolean, true if the food is successfully added
     */
    public static boolean addFood(Food food)
    {
        if (FOOD_DATABASE.add(food)) {
            lastid = food.getId();
            return true;
        }
        return false;
    }

    /**
     * this method is to remove some food from database array list by specifying it's id
     * @param id is the food's id for the expected food object this method returns
     * @return a Food class object in respect of the id specified in the parameter
     * @throws FoodNotFoundException to check whether the food that goes by the id in the parameter exist or not
     */
    public static boolean removeFood (int id) throws FoodNotFoundException {
        for(Food food : FOOD_DATABASE) {
            if (food != null) {
                FOOD_DATABASE.remove(food);
                return true;
            }
        }
        throw new FoodNotFoundException(id);
    }

}
