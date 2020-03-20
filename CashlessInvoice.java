
/**
 * Write a description of class CashlessInvoice here.
 *
 * @author Fahri Alamsyah
 * @version 12-03-2020
 */
public class CashlessInvoice extends Invoice
{
    // instance variables - replace the example below with your own
    private static PaymentType PAYMENT_TYPE = PaymentType.Cashless;
    private Promo promo;

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
         if(promo != null && promo.getActive() == true && getFood().getPrice() >= promo.getMinPrice() ){         
       return "================INVOICE================" +
        "ID: " + super.getId()+
        "Food: " + super.getFood().getName()+
        //"Date: " + super.getDate()+
        "Customer: " + getCustomer().getName()+
        "Promo: " + promo.getCode()+
        "Total Price: " + this.totalPrice + " Selamat Anda hemat " + promo.getDiscount() +
        "Status: " + getInvoiceStatus() +
        "Payment Type: " + getPaymentType();
        }else if(promo != null && promo.getActive() == true && getFood().getPrice() < promo.getMinPrice() ){
        return "================INVOICE================"+
        "ID: " + super.getId()+ 
        "Food: " + super.getFood().getName()+ 
       // "Date: " + super.getDate()+
        "Customer: " + getCustomer().getName()+
        "Total Price: " + this.totalPrice + "(promo tidak dapat digunakan)"+
        "Status: " + getInvoiceStatus()+
        "Payment Type: " + getPaymentType();
        }else{
        return "================INVOICE================"+
        "ID: " + super.getId()+
        "Food: " + super.getFood().getName()+
        "Date: " + super.getDate()+
        "Customer: " + getCustomer().getName()+
        "Total Price: " + this.totalPrice + "(Terdapat promo code, silahkan gunakan)"+
        "Status: " + getInvoiceStatus()+
        "Payment Type: " + getPaymentType();
        }
       
    }
}
