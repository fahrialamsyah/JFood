
/**
 * Enumeration class InvoiceStatus - write a description of the enum class here
 *
 * @author Fahri Alamsyah
 * @version 6 Maret 2020
 */
public enum InvoiceStatus
{
    Ongoing("Ongoing"),Finished("Finished"),Cancelled("Cancelled");
    
    private String invoice;
    
    InvoiceStatus(String invoice)
    {
        this.invoice = invoice;
    }
    
    public String toString()
    {
        return invoice;
    }
    
}
