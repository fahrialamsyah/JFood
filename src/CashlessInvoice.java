import java.util.*;
import java.text.SimpleDateFormat;
/**
 * Write a description of class CashlessInvoice here.
 *
 * @author Fahri Alamsyah
 * @version 02 - 04 -2020
 */
public class CashlessInvoice extends Invoice
{
    // instance variables - replace the example below with your own
    private PaymentType PAYMENT_TYPE = PaymentType.Cashless;
    private Promo promo;
    private int total = 0;

    /**
     * Constructor for objects of class CashlessInvoice
     */
    public CashlessInvoice(int id, ArrayList<Food> food, Customer customer)
    {
        // initialise instance variables
        super(id, food, customer);


    }

    public CashlessInvoice(int id, ArrayList<Food> food, Customer customer, Promo promo) {
        super(id, food, customer);
        this.promo = promo;
    }

    public PaymentType getPaymentType() {
        return PAYMENT_TYPE;
    }

    public Promo getPromo() {
        return promo;
    }

    public void setPromo(Promo promo) {
        this.promo = promo;
    }

    public void setTotalPrice() {
        if (promo!=null && promo.getActive()==true && (totalPrice)>promo.getMinPrice()){
            this.totalPrice=totalPrice-promo.getDiscount();
        }
        else{
            this.totalPrice=totalPrice;
        }

    }

    public String toString(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        String strFoodList = "";
        ArrayList<Food> list = super.getFoods();
        for (Food food: list) {
            strFoodList += food.getName() + "\n";
        }

        String ret = "\nId: " + super.getId() + "\n" +
                "Food Name: \n" + strFoodList+ "\n" +
                "Date: " + formatter.format(super.getDate().getTime()) + "\n" +
                "Total Price: " + super.totalPrice + "\n" +
                "Customer Name: " + super.getCustomer().getName() + "\n" +
                //"Invoice Status: " + super.getInvoiceStatus().toString() + "\n" +
                "Payment Type: " + PAYMENT_TYPE.toString();

        if ((promo != null && promo.getActive() && total > promo.getMinPrice())) {
            ret += "\nPromo code: " + promo.getCode() + "\n";
            return ret;
        } else {
            return ret;
        }
    }
}
