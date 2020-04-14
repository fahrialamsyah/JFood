package fahrialamsyah.jfood;
/**
 * Write a description of class PriceCalculator here.
 *
 * @author Fahri Alamsyah
 * @version 09 - 04 - 2020
 */

public class PriceCalculator implements Runnable {
    private Invoice invoice;
    PriceCalculator(Invoice invoice){
        this.invoice = invoice;
    }
    public void run( ){
        System.out.println("Calculating invoice Id: " + invoice.getId());
        invoice.setTotalPrice();
        System.out.println("Finish Calculating invoice Id: " + invoice.getId());

    }

}
