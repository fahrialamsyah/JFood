import java.util.ArrayList;

/**
 * Write a description of class Food here.
 *
 * @author Fahri Alamsyah
 * @version 09-04-2020
 */
public class DatabaseFood
{
    // instance variables - replace the example below with your own
    private static ArrayList<Food> FOOD_DATABASE = new ArrayList<>();
    private static int lastId = 0;





    /**
     * <h1> This method used for adding food to the database</h1>
     * @param food Food object
     * @return boolean
     */
    public static boolean addFood(Food food) {

        if (FOOD_DATABASE.add(food)) {
            lastId = food.getId();
            return true;
        }
        return false;
    }


    /** <h1> This method used for removing food from the database </h1>

     * @return boolean
     */
    public static boolean removeFood(int id) throws FoodNotFoundException{
        for (Food food: FOOD_DATABASE) {
            if (food.getId() == id) {
                FOOD_DATABASE.remove(food);
                return true;
            }
        }
        throw new FoodNotFoundException(id);
    }


    /**
     * <h1>This method will return the food object</h1>
     * @return Food object
     */
    public static Food getFoodById(int id) throws FoodNotFoundException{
        for (Food food: FOOD_DATABASE) {
            if (food.getId() == id) {
                return food;
            }
        }
        throw new FoodNotFoundException(id);
    }

    public static ArrayList<Food> getFoodBySeller(int idseller) {
        ArrayList<Food> ret = new ArrayList<>();
        for (Food food: FOOD_DATABASE) {
            if (food.getSeller().getId() == idseller) {
                ret.add(food);
            }
        }
        return ret;
    }

    public static ArrayList<Food> getFoodByCategory(FoodCategory category) {
        ArrayList<Food> ret = new ArrayList<>();
        for (Food food: FOOD_DATABASE) {
            if (food.getCategory() == category) {
                ret.add(food);
            }
        }
        return ret;
    }
    /**
     * <h1>This method will return a list of food as an array of string</h1>
     * @return String[]
     */
    public static ArrayList<Food> getFoodDatabase(){
        return FOOD_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }
}
