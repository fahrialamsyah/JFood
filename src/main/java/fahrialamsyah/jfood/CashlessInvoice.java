package fahrialamsyah.jfood;
/**
 * Subclass of Invoice class, this class stores information for any cashless transaction
 * @author Fahri Alamsyah
 * @version 1.0
 * @since 27 - 2 - 2020
 */
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class CashlessInvoice extends Invoice {
    // instance variables - replace the example below with your own
    private static final PaymentType PAYMENT_TYPE = PaymentType.Cashless;
    private Promo promo;
    private int totalCashlessPrice;

    /**
     * Constructor for objects of class CashInvoice
     * @param id is the id of the current invoice
     * @param foods is an array list that consist of object of Food class that specifies a list of foods the customer orders in the current invoice
     * @param customer is a customer class object of the customer who orders in respect of this current invoice
     * @param totalCashlessPrice is to find out the results of transaction calculations using the cashless invoice method
     */

    public CashlessInvoice(int id, ArrayList<Food> foods, int totalCashlessPrice,  Customer customer) {
        super(id, foods,  totalCashlessPrice, customer);
        //setTotalPrice();

    }

    /**
     * Second Constructor using overloading method
     * @param promo is a promo class object that this invoice use for if any promo is used
     */

    public CashlessInvoice(int id, ArrayList<Food> foods, int totalCashlessPrice, Customer customer, Promo promo) {
        super(id, foods, totalCashlessPrice, customer);
        this.promo = promo;
        //setTotalPrice();
    }

    /**
     * getter for current invoice's payment type
     * @return an integer value of this invoice delivery fee
     */
    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }

    /**
     * getter for current invoice's promo in object of Promo class
     * @return an object of Promo class if this invoice use any valid promo code
     */
    public Promo getPromo()
    {
        return promo;
    }

    /**
     * setter for current invoice's promo
     * @param promo is the promo that this invoice is going to use
     */
    public void setPromo(Promo promo)
    {
        this.promo = promo;
    }

    /**
     * this method is to calculate the total price for current invoice
     * dimana menggunakan kondisi if jika harga memenuhi syarat dan promo yang dipakai aktif ,
     * lalu else jika tidak ada promo.
     */

    /*public void setTotalPrice() {
        for (Food foods : getFood()) {
            if ((promo != null) && (promo.getActive()) && (foods.getPrice() > getPromo().getMinPrice())) {
                super.totalPrice = (foods.getPrice() - promo.getDiscount());
            } else {
                super.totalPrice = foods.getPrice();
            }
        }
    }*/

    /**
     * this method is to return a complete string of the invoice informations
     * @return a String about the information of current invoice
     */
    public String toString() {
        //string manipulation buat list makanan yang dibeli
        String string = "";
        for (int i = 0; i <= getFood().size(); i++) {
            //return value
            // set waktu sekarang
            //if promo tidak ada / tidak aktif / total harga tidak memenuhi syarat promo maka:
            if (getPromo() != null && getPromo().getActive() == true && getFood().get(i).getPrice() > getPromo().getMinPrice()) {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy");
                LocalDateTime now = LocalDateTime.now();
                string =
                        ("================INVOICE================" +
                                "\nID: " + super.getId() +
                                "\nFood: " + super.getFood().get(i).getName() +
                                "\nDate: " + dtf.format(now) +
                                "\nCustomer: " + super.getCustomer().getName() +
                                "\nTotal Price: " + getFood().get(i).getPrice() +
                                "\nPromo:" +getPromo().getCode() +
                                "\nStatus: " + super.getStatus() +
                                "\nPayment Type: " + PAYMENT_TYPE + "\n");
            }
            //jika kondisi promo dipenuhi maka :
            else {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy");
                LocalDateTime now = LocalDateTime.now();
                string =
                        ("================INVOICE================" +
                                "\nID: " + super.getId() +
                                "\nFood: " + super.getFood().get(i).getName() +
                                "\nDate: " + dtf.format(now) +
                                "\nCustomer: " + super.getCustomer().getName() +
                                "\nTotal Price: " + totalCashlessPrice +
                                "\nStatus: " + super.getStatus() +
                                "\nPayment Type: " + PAYMENT_TYPE + "\n");
            }

        }
        return string;
    }
}
