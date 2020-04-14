package fahrialamsyah.jfood;
/**
 * Write a description of class PromoCodeAlreadyExistsException here.
 *
 * @author Fahri Alamsyah
 * @version 09 - 04 - 2020
 */

public class PromoCodeAlreadyExistsException extends Exception{
    private Promo promo_error;

    PromoCodeAlreadyExistsException(Promo promo_input){
        super("Promo Code: ");
        promo_error = promo_input;
    }

    public String getMessage(){
        return super.getMessage() + promo_error.getCode() + " already exist.";
    }
}
