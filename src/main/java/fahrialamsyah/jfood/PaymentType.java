package fahrialamsyah.jfood;

/**
 * Enumeration class PaymentType - write a description of the enum class here
 *
 * @author Fahri Alamsyah
 * @version 16 - 04 - 2020
 */
public enum PaymentType
{
    Cashless("Cashless"),
    Cash("Cash");

    private String cash;

    PaymentType(String cash) {
        this.cash = cash;
    }

    public String toString() {
        return cash;
    }
}
