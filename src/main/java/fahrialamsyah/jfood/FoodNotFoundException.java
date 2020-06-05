package fahrialamsyah.jfood;
/**
 * Exception Class to throw exception if id is out of bounds/not found food's Id for any method that needs food's Id as its parameter
 * @author Fahri Alamsyah
 * @version 1.0
 * @since 27 - 2 - 2020
 */
public class FoodNotFoundException extends Exception{
    private int food_error;

    public FoodNotFoundException (int food_input){
        super("Food :");
        this.food_error = food_input;
    }

    public String getMessage()
    {
        return super.getMessage() + food_error + "not_found";
    }
}

