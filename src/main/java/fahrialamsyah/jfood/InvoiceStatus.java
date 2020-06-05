package fahrialamsyah.jfood;
/**
 * Enumeration class InvoiceStatus - write a description of the enum class here
 *
 * @author Fahri Alamsyah
 * @version 16-04-2020
 */
public enum InvoiceStatus
{
    Ongoing("Ongoing"),
    Finished("Finished"),
    Cancelled("Cancelled");


    private String invoiceStatus;

    InvoiceStatus (String invoiceStatus)
    {
        this.invoiceStatus = invoiceStatus;
    }

    public String toString() {
        return invoiceStatus;
    }
}

