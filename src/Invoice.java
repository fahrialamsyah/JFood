import java.util.*;
/**
 * Write a description of class Food here.
 *
 * @author Fahri Alamsyah
 * @version 09 - 04 - 2020
 */
public abstract class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    private ArrayList<Food> food;
    private Calendar date;
    protected int totalPrice;
    private Customer customer;
    private InvoiceStatus invoiceStatus;

    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(int id, ArrayList<Food> food, Customer customer)
    {
        // initialise instance variables
        Calendar calendar = Calendar.getInstance();

        this.id = id;
        this.food = food;
        this.customer = customer;
        this.date = new GregorianCalendar(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
        this.invoiceStatus = InvoiceStatus.Ongoing;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @return id return the id of the invoice
     */
    public int getId(){
        return id;
    }


    public ArrayList<Food> getFoods() {
        return food;
    }


    /**
     * @return String
     */
    public Calendar getDate(){
        return date;
    }


    /**
     * @return int
     */
    public int getTotalPrice(){
        return totalPrice;
    }


    /**
     * @return Customer
     */
    public Customer getCustomer(){
        return customer;
    }

    public abstract PaymentType getPaymentType();

    public InvoiceStatus getInvoiceStatus() {
        return invoiceStatus;
    }


    public void setInvoiceStatus(InvoiceStatus invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    /**
     * @param customer
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    /**
     * @param id
     */
    public void setId(int id){
        this.id = id;
    }


    public void setFood (ArrayList<Food> food) {
        this.food = food;
    }


    /**
     * @param date
     */
    public void setDate(Calendar date){
        this.date = date;
    }

    public void setDate(int year, int month, int dayOfMonth){
        this.date = new GregorianCalendar(year, month, dayOfMonth);
    }

    /**
     */
    public abstract void setTotalPrice();

    public abstract String toString();





}
