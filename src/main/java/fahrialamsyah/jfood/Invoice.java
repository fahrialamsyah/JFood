package fahrialamsyah.jfood; /**
 * <h1>Invoice<h1>
 * Kelas ini berfungsi untuk mendapatkan dan memberikan nilai pada obyek invoice
 * dengan memanfaatkan method constructor, mutator, dan accessor
 *
 * @author Fahri Alamsyah
 * @version 27-February-2020
 *
 */

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.lang.*;

public abstract class Invoice
{
    //Atribut yang digunakan pada kelas ini dengan access modifier private
    private int id;
    ArrayList<Food> foods = new ArrayList<Food>();
    private Calendar date;
    protected int totalPrice;
    private Customer customer;
    private InvoiceStatus invoiceStatus;
    /**
     * Sebuah constructor pada kelas awal yang akan memberikan nilai ketika
     * method ini dipanggil dengan menginisiasikan nilai awal sesuai dengan
     * parameternya
     *
     * @param id memberi nilai berupa id dengan tipe data int
     * @param idFood memberi nilai berupa id makanan dengan tipe data int
     * @param date memberi nilai berupa harga dengan tipe data string
     * @param totalProce memberi nilai berupa kategori dengan tipe data int
     * @param <customer memasukkan obyek customer
     */
    public Invoice(int id, ArrayList<Food> foods,int totalPrice, Customer customer)
    {
        //Kata kunci this digunakan untuk mereferensikan obyek saat ini yaitu invoice
        this.id = id;
        this.foods = foods;
        this.totalPrice = totalPrice;
        this.customer = customer;
        this.date = Calendar.getInstance();
        this.invoiceStatus = InvoiceStatus.Ongoing;
    }



    /**
     * Method getID merupakan method getter untuk variabel id
     * @return <code>int<code> akan mengembalikan nilai id ketika method ini
     * dipanggil
     */
    public int getId (){
        return id;
    }

    /**
     * Method getIdFood merupakan method getter untuk variabel idFood
     * @return <code>int<code> akan mengembalikan nilai idFood ketika method ini
     * dipanggil
     */
    public ArrayList<Food> getFood (){
        return foods;
    }

    /**
     * Method getDate merupakan method getter untuk variabel date
     * @return <code>String<code> akan mengembalikan nilai date ketika method ini
     * dipanggil
     */
    public Calendar getDate(){
        return date;
    }

    /**
     * Method getTotalProve merupakan method getter untuk variabel totalPrice
     * @return <code>int<code> akan mengembalikan nilai totalPrice ketika method ini
     * dipanggil
     */
    public int getTotalPrice(){
        return totalPrice;
    }

    /**
     * Method getCustomer merupakan method getter untuk obyek customer
     * @return <code>Seller<code> akan mengembalikan nilai customer ketika method ini
     * dipanggil
     */
    public Customer getCustomer(){
        return customer;
    }

    /**
     *
     */
    public abstract PaymentType getPaymentType();

    public InvoiceStatus getStatus() {
        return invoiceStatus;
    }

    /**
     * Method setID merupakan method setter untuk variabel id
     * @return tidak ada
     */
    public void setId(int id){
        this.id = id;
    }

    /**
     * Method setIdFood merupakan method setter untuk variabel idFood
     * @return tidak ada
     */
    public void setFood(ArrayList<Food> foods){
        this.foods = foods;
    }

    /**
     * Method setDate merupakan method setter untuk variabel date
     * @return tidak ada
     */
    public void setDate(Calendar date) {
        this.date = date;
    }

    public void setDate(int year, int month, int dayOfMonth) {
        this.date = new GregorianCalendar(year, month-1, dayOfMonth);
    }

    /**
     * Method setTotalPrice merupakan method setter untuk variabel totalPrice
     * @return tidak ada
     */
    //public abstract void setTotalPrice();

    /**
     * Method setLocation merupakan method setter untuk obyek location
     * @return tidak ada
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setInvoiceStatus(InvoiceStatus status) {
        this.invoiceStatus = status;
    }

    /**
     * Method ini akan mencetak semua variabel yang telah diset oleh variable setter
     */
    public abstract String toString();


}
