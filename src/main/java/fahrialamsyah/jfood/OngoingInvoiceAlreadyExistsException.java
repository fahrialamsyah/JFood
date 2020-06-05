package fahrialamsyah.jfood;
/**
 * Exception Class to throw exception if any method called returns an Invoice Class object that the invoiceStatus field string value is "ongoing"
 * @author Fahri Alamsyah
 * @version 1.0
 * @since 27 - 2 - 2020
 */
public class OngoingInvoiceAlreadyExistsException extends Exception {
    private Invoice invoice_error;

    public OngoingInvoiceAlreadyExistsException (Invoice invoice_input) {
        super("Invoice ");
        this.invoice_error=invoice_input;
    }

    public String getMessage()
    {
        return super.getMessage() + invoice_error.getId() + " already exists.";
    }
}
