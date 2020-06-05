package fahrialamsyah.jfood;
/**
 * Exception Class to throw exception if id is out of bounds/not found invoice's Id for any method that needs invoice's Id as its parameter
 * @author Fahri Alamsyah
 * @version 1.0
 * @since 27 - 2 - 2020
 */
public class InvoiceNotFoundException extends Exception{

    private int invoice_error;

    public InvoiceNotFoundException (int invoice_input) {
        super("Invoice : ");
        this.invoice_error=invoice_input;
    }

    public String getMessage()
    {
        return super.getMessage() + invoice_error + " Not Found.";
    }
}