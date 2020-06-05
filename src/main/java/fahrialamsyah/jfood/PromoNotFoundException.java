package fahrialamsyah.jfood;
/**
 * Exception Class to throw exception if id is out of bounds/not found promo's Id for any method that needs promo's Id as its parameter
 * @author Fahri Alamsyah
 * @version 1.0
 * @since 27 - 2 - 2020
 */
public class PromoNotFoundException extends Exception {
    private int promo_error;

    public PromoNotFoundException (int promo_input){
        super("Promo :");
        this.promo_error = promo_input;
    }

    public String getMessage()
    {
        return super.getMessage() + promo_error + " not found";
    }
}
