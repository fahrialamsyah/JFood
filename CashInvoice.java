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
    private static PaymentType PAYMENT_TYPE = PaymentType.Cash;
    private int deliveryFee;
 

    /**
     * Constructor for objects of class CashlessInvoice
     */
    public CashInvoice(int id, Food food, String date,Customer customer,InvoiceStatus invoiceStatus)
    {
        //parameter id untuk deklarasi awalan 
        //parameter food untuk deklarasi awalan 
        //parameter date untuk deklarasi awalan 
        //parameter customer untuk deklarasi awalan 
        //parameter invoiceStatus untuk deklarasi awalan 
        super(id, food, date, customer, invoiceStatus);
        
    }
    
    public CashInvoice(int id, Food food, String date,Customer customer,InvoiceStatus invoiceStatus,int deliveryFee)
    {
        // initialise instance variables
        //parameter id untuk deklarasi awalan 
        //parameter food untuk deklarasi awalan 
        //parameter date untuk deklarasi awalan 
        //parameter customer untuk deklarasi awalan 
        //parameter invoiceStatus untuk deklarasi awalan
        //parameter deliveryFee untuk deklarasi awalan 
        super(id, food, date, customer, invoiceStatus);
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
        if (deliveryFee == 0)
        {
             super.totalPrice = getFood().getPrice();
            
        }
        else
        {
            super.totalPrice = getFood().getPrice() + deliveryFee;
        }
    }
        
    
    /**
     * Print Data (Post Test Modul 4)
     */
    public void printData()
    {
        System.out.println("=========Invoice==========");
        System.out.println("ID: "+ getId());
        System.out.println("Food ID: "+ getFood().getId());
        System.out.println("Date: "+ getDate());
        System.out.println("Customer: "+ getCustomer().getName());
        System.out.println("Delivery Fee :" +getDeliveryFee());
        System.out.println("TotalPrice: "+ totalPrice);
        System.out.println("Status: "+ getInvoiceStatus());
        System.out.println("Payment Type: "+ getPaymentType());
    }
}