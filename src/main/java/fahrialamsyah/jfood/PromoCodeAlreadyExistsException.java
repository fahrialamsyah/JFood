package fahrialamsyah.jfood;
/**
 * Exception Class to throw exception if any method called returns a Promo Class object that already exist in the database
 * @author Fahri Alamsyah
 * @version 1.0
 * @since 27 - 2 - 2020
 */
public class PromoCodeAlreadyExistsException extends Exception{
    private Promo promo_error;

    public PromoCodeAlreadyExistsException (Promo promo_input){
        super("Promo :");
        this.promo_error = promo_input;
    }

    public String getMessage()
    {
        return super.getMessage() + promo_error.getCode() + " already exists.";

    }
}
