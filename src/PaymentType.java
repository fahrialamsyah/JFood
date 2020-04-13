
/**
 * Enumeration class PaymentType - write a description of the enum class here
 *
 * @author Fahri Alamsyah
 * @version 13 - 04 - 2020
 */
public enum PaymentType
{
    Cashless ("Cashless"),
    Cash ("Cash");

    private String paymentType;

    PaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String toString(){
        return paymentType;
    }
}
