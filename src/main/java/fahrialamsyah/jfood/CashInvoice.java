package fahrialamsyah.jfood;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
/**
 * Subclass of Invoice class, this class stores information for any cash transaction
 * @author Fahri Alamsyah
 * @version 1.0
 * @since 27 - 2 - 2020
 */

public class CashInvoice extends Invoice {
    // instance variables - replace the example below with your own
    private static final PaymentType PAYMENT_TYPE = PaymentType.Cash;
    private int deliveryFee;
    private int totalCashInvoice;

    /**
     * Constructor for objects of class CashInvoice
     * @param id is the id of the current invoice
     * @param foods is an array list that consist of object of Food class that specifies a list of foods the customer orders in the current invoice
     * @param totalCashInvoice is to find out the results of transaction calculations using the cash invoice method
     * @param customer is a customer class object of the customer who orders in respect of this current invoice
     */

    public CashInvoice(int id, ArrayList<Food> foods, int totalCashInvoice, Customer customer) {
        super(id, foods, totalCashInvoice, customer);

    }

    /**
     * Second Constructor using overloading method
     * @param deliveryFee is the value of delivery fee for the current invoice
     */

    public CashInvoice(int id, ArrayList<Food> foods, int totalCashInvoice, Customer customer, int deliveryFee) {
        super(id, foods, totalCashInvoice, customer);
        this.deliveryFee = deliveryFee;
        //setTotalPrice();
    }

    /**
     * getter for current invoice's payment type
     * @return a payment type enum
     */

    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }

    /**
     * getter for current invoice's delivery fee value in integer
     * @return an integer value of this invoice delivery fee
     */

    public int getDeliveryFee()
    {
        return deliveryFee;
    }

    /**
     * setter for this invoice's delivery fee
     * @param deliveryFee is the delivery fee that wanted to be specified in the current invoice
     */

    public void setDeliveryFee(int deliveryFee)
    {
        this.deliveryFee = deliveryFee;
    }

    /**
     * this method is to calculate the total price for current invoice
     */

    /* public void setTotalPrice() {
         int totalFoodPrice = 0;
         for (int i = 0; i < getFood().size(); i++) {
             totalFoodPrice = totalFoodPrice + getFood().get(i).getPrice();
         }
         if (deliveryFee != -1) {
            super.totalPrice = totalFoodPrice + deliveryFee;
         } else {
             super.totalPrice = totalFoodPrice;
         }
     }*/
    /**
     * this method is to return a complete string of the invoice informations
     * @return a String about the information of current invoice
     */
    @Override
    public String toString() {
        //inisiasi waktu sekarang
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");

        //String manipulation untuk list makanan yang dibeli
        String foods = "";
        for(Food foodList : getFood())
        {
            foods = foods + foodList.getName() + ", ";
        }
        foods = foods.substring(0, foods.length() - 2);

        //return value
        return "============INVOICE CASH============"+
                "\nID :" + super.getId()+
                "\nFoods :"  + foods+
                "\nDate :" + sdf.format(super.getDate().getTime())+
                "\nCustomer :" + super.getCustomer().getName()+
                "\nDelivery Fee :" + getDeliveryFee()+
                "\nTotal price :" + totalCashInvoice+
                "\nStatus :" + super.getStatus()+
                "\nPayment Type :" + getPaymentType();
    }

}
