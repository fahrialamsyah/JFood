
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
    public CashlessInvoice(int id, Food food, String date,Customer customer,InvoiceStatus invoiceStatus)
    {
        // initialise instance variables
        super(id, food, date, customer, invoiceStatus);
        
    }
    
    public CashlessInvoice(int id, Food food, String date,Customer customer,InvoiceStatus invoiceStatus, Promo promo)
    {
        // initialise instance variables
        super(id, food, date, customer, invoiceStatus);
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
    public void printData()
    {
        System.out.println("=========Invoice==========");
        System.out.println("ID: "+ getId());
        System.out.println("Food ID: "+ getFood().getId());
        System.out.println("Date: "+ getDate());
        System.out.println("Customer: "+ getCustomer().getName());
        System.out.println("TotalPrice: "+ totalPrice);
        System.out.println("Status: "+ getInvoiceStatus());
        System.out.println("Payment Type: "+ getPaymentType());
        if(getPromo() != null && getPromo().getActive() == true && getFood().getPrice() > getPromo().getMinPrice())
         {
             this.totalPrice = (getFood().getPrice()- getPromo().getDiscount());
     
         }
        
       
    }
}
