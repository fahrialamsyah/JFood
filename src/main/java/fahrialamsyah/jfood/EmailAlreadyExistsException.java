package fahrialamsyah.jfood;
/**
 * Exception Class to throw exception if any method called returns a Customer Class object that the email field
 * is already exist in the customer database
 * @author Fahri Alamsyah
 * @version 1.0
 * @since 27 - 02 - 2020
 */
public class EmailAlreadyExistsException extends Exception{
    private  Customer customer_error;

    public EmailAlreadyExistsException (Customer customer_input){
        super("Email :");
        this.customer_error = customer_input;
    }

    public String getMessage()
    {
        return super.getMessage() + customer_error.getEmail() + " already exists.";
    }
}
