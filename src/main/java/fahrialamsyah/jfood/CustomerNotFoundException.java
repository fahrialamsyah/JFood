package fahrialamsyah.jfood;
/**
 * Exception Class to throw exception if id is out of bounds/not found Customer's Id for any method that needs Customer's Id as its parameter
 * @author Fahri Alamsyah
 * @version 1.0
 * @since 27 - 2 - 2020
 */
public class CustomerNotFoundException extends Exception{
    private int customer_error;

    public CustomerNotFoundException (int customer_input){
        super("Customer");
        this.customer_error = customer_input;
    }

    public String getMessage()
    {
        return super.getMessage() + customer_error + " not found";
    }



}
