import java.util.*;
import java.util.regex.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
/**
 * Write a description of class CashlessInvoice here.
 *
 * @author Fahri Alamsyah
 * @version 12-03-2020
 */
public class CashlessInvoice extends Invoice
{
    // instance variables - replace the example below with your own
    private static final PaymentType PAYMENT_TYPE = PaymentType.Cashless;
    private Promo promo;
     private SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");

    /**
     * Constructor for objects of class CashlessInvoice
     */
    public CashlessInvoice(int id, Food food,Customer customer,InvoiceStatus invoiceStatus)
    {
        // initialise instance variables
        super(id, food,customer, invoiceStatus);
        
    }
    
    public CashlessInvoice(int id, Food food,Customer customer,InvoiceStatus invoiceStatus, Promo promo)
    {
        // initialise instance variables
        super(id, food, customer, invoiceStatus);
        this.promo = promo;
        
    }
    
    /**
     * Getter payment Type for Cashless Invoice
     * @return id untuk mengecek variabel id ke variabel instance
     */
     public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }
    
     public Promo getPromo()
    {
        return promo;
    }
    
     public void setPromo(Promo promo)
    {
        this.promo = promo;
    }
    
     public void setTotalPrice()
     {
         if(getPromo() != null && getPromo().getActive() == true && getFood().getPrice() > getPromo().getMinPrice())
         {
             super.totalPrice = (getFood().getPrice()-getPromo().getDiscount());
     
         }
         else
         {
             
             super.totalPrice = getFood().getPrice();
         }
            
        }
    
    /**
     * Print Data (Post Test No 2)
     */
    public String toString()
    {
        SimpleDateFormat dateNow = this.dateFormat;
       if(promo != null && promo.getActive() == true && getFood().getPrice() >= promo.getMinPrice() ){         
       return "================INVOICE================" + "\n"+
        "ID: " + super.getId()+ "\n"+
        "Food: " + super.getFood().getName()+ "\n"+
        "Date: " + dateNow.format(super.getDate().getTime())+
        "Customer: " + getCustomer().getName()+ "\n"+
        "Promo: " + promo.getCode()+ "\n"+
        "Total Price: " + this.totalPrice + " Selamat Anda hemat " + promo.getDiscount() + "\n"+
        "Status: " + getInvoiceStatus() + "\n"+
        "Payment Type: " + getPaymentType()+ "\n";
        }else if(promo != null && promo.getActive() == true && getFood().getPrice() < promo.getMinPrice() ){
        return "================INVOICE================"+ "\n"+
        "ID: " + super.getId()+ "\n"+
        "Food: " + super.getFood().getName()+ "\n"+
        "Date: " + dateNow.format(super.getDate().getTime()) + "\n"+
        "Customer: " + getCustomer().getName()+ "\n"+
        "Total Price: " + this.totalPrice + "(promo tidak dapat digunakan)"+ "\n"+
        "Status: " + getInvoiceStatus()+ "\n"+
        "Payment Type: " + getPaymentType()+ "\n";
        }else{
        return "================INVOICE================"+ "\n"+
        "ID: " + super.getId()+ "\n"+
        "Food: " + super.getFood().getName()+ "\n"+
        "Date: " + dateNow.format(super.getDate().getTime())+ "\n"+
        "Customer: " + getCustomer().getName()+ "\n"+
        "Total Price: " + this.totalPrice + "(Terdapat promo code, silahkan gunakan)"+ "\n"+
        "Status: " + getInvoiceStatus()+ "\n"+
        "Payment Type: " + getPaymentType()+ "\n";
        }
       
    }
}
