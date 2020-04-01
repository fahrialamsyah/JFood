import java.util.*;
import java.util.regex.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
/**
 * Ini adalah kelas CashInvoice
 *
 * @author Fahri Alamsyah
 * @version 12-03-2020 (Post Test Modul4)
 */
public class CashInvoice extends Invoice
{
    // instance variables - replace the example below with your own
    /**
     * Bagian dari Variabel instances
     * Modifier private akan membuat member hanya bisa diakses oleh dari dalam class itu sendiri.
     * Perlu diingat: 
     * Modifier private tidak bisa diberikan kepada class, enum, dan interface. 
     * Modifier private hanya bisa diberikan kepada member class.
     */
    private static final PaymentType PAYMENT_TYPE = PaymentType.Cash;
    private int deliveryFee = 0;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
 

    /**
     * Constructor for objects of class CashlessInvoice
     */
    public CashInvoice(int id, Food food,Customer customer,InvoiceStatus invoiceStatus)
    {
        //parameter id untuk deklarasi awalan 
        //parameter food untuk deklarasi awalan 
        //parameter date untuk deklarasi awalan 
        //parameter customer untuk deklarasi awalan 
        //parameter invoiceStatus untuk deklarasi awalan 
        super(id, food, customer, invoiceStatus);
        
    }
    
    public CashInvoice(int id, Food food, Customer customer,InvoiceStatus invoiceStatus,int deliveryFee)
    {
        // initialise instance variables
        //parameter id untuk deklarasi awalan 
        //parameter food untuk deklarasi awalan 
        //parameter date untuk deklarasi awalan 
        //parameter customer untuk deklarasi awalan 
        //parameter invoiceStatus untuk deklarasi awalan
        //parameter deliveryFee untuk deklarasi awalan 
        super(id, food, customer, invoiceStatus);
        this.deliveryFee = deliveryFee;
        
    }
    
    /**
     * Getter PAYMENT_TYPE for Cash Invoice
     * @return PAYMENT_TYPE untuk mengecek variabel PAYMENT_TYPE ke variabel instance
     */
     public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }
    
    /**
     * Getter DeliveryFee for Cash Invoice
     * @return DeliveryFee untuk mengecek variabel DeliveryFee ke variabel instance
     */ 
    public int getDeliveryFee()
    {
        return deliveryFee;
    }
    
    /**
     * Setter DeliveryFee for Cash Invoice
     * @this DeliveryFee untuk memasukkan variabel DeliveryFee ke variabel instance
     */  
    public void setDeliveryFee(int deliveryFee)
    {
        this.deliveryFee = deliveryFee;
    }
    
    /**
     * Setter TotalPrice for Cash Invoice
     * @super TotalPrice untuk memasukkan variabel TotalPrice ke variabel instance
     */  
     public void setTotalPrice()
     {
        if(deliveryFee != 0){
            super.totalPrice = super.getFood().getPrice() + getDeliveryFee();
        }else{
            super.totalPrice = super.getFood().getPrice();
        }
    }
        
    
    /**
     * Print Data (Post Test Modul 4)
     */
    public String toString()
    {
        SimpleDateFormat dateNow = this.dateFormat;
        return "=========Invoice=========="+"\n"+
        "ID: "+ getId()+ "\n"+
        "Food ID: "+ getFood().getId()+ "\n" +
        "Date: "+ dateNow.format(super.getDate().getTime())+ "\n" +
        "Customer: "+ getCustomer().getName()+ "\n"+
        "Delivery Fee :" +getDeliveryFee()+ "\n"+
        "TotalPrice: "+ super.totalPrice+ "\n" +
        "Status: "+ getInvoiceStatus()+ "\n" +
        "Payment Type: "+ getPaymentType()+ "\n";
    }
}