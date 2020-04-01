
/**
 * Enumeration class PaymentType - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
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
