import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
/**
 * Ini adalah Class CashInvoice
 *
 * @author Fahri Alamsyah
 * @version 02 - 04 - 2020
 */

public class CashInvoice extends Invoice {
    private PaymentType PAYMENT_TYPE = PaymentType.Cash;
    private int deliveryFee;
    private int total = 0;
    public CashInvoice(int id, ArrayList<Food> food, Customer customer) {
        super(id, food, customer);
    }

    public CashInvoice(int id, ArrayList<Food> food, Customer customer, int deliveryFee){
        super(id, food, customer);
        this.deliveryFee = deliveryFee;
    }

    public int getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(int deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public void setTotalPrice() {
        ArrayList<Food> listFood = super.getFoods();


        for (Food food: listFood) {
            total += food.getPrice();
        }


        if (deliveryFee > 0) {
            super.totalPrice = total + deliveryFee;
        } else {
            super.totalPrice = total;
        }
    }

    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        String strFoodList = "";
        ArrayList<Food> list = super.getFoods();
        for (Food food: list) {
            strFoodList += food.getName() + "\n";
        }

        return "\nId: " + super.getId() + "\n" +
                "Food Name: " + strFoodList + "\n" +
                "Date: " + formatter.format(super.getDate().getTime()) + "\n" +
                "Delivery Fee: " + deliveryFee + "\n" +
                "Total Price: " + super.totalPrice + "\n" +
                "Customer Name: " + super.getCustomer().getName() + "\n" +
               // "Invoice Status: " + super.getInvoiceStatus().toString() + "\n" +
                "Payment Type: " + PAYMENT_TYPE.toString();
    }

    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }
}