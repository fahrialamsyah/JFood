
/**
 * Enumeration class InvoiceStatus - write a description of the enum class here
 *
 * @author Fahri Alamsyah
 * @version 09 - 04 - 2020
 */
public enum InvoiceStatus
{
    Ongoing("Ongoing"), Finished("Finished"), Cancelled("Cancelled");
    private String status;

    InvoiceStatus(String status) {
        this.status = status;
    }

    public String toString(){
        return status;
    }
}
