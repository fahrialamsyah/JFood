
/**
 * Enumeration class PaymentType - write a description of the enum class here
 *
 * @author Fahri Alamsyah
 * @version 02 - 04 - 2020
 */
public enum PaymentType
{
    Cash("Cash"), Cashless("Cashless");
    
    private String payment;
    
    PaymentType(String payment)
    {
        this.payment = payment;
    }
    
    public String toString()
    {
        return payment;
    }
    
    
}
