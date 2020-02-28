
/**
 * Ini adalah class invoice yang terdiri dari id, idFood, date, totalPrice, Customer sebagai atribut
 * Class merupakan sebuah blueprint dari sebuah objek yang merepresentasikan konsep objek
 *
 * @author Fahri Alamsyah
 * @version 27-02-2020
 */
public class Invoice
{
    /**
     * Bagian dari Variabel instances
     * Modifier private akan membuat member hanya bisa diakses oleh dari dalam class itu sendiri.
     * Perlu diingat: 
     * Modifier private tidak bisa diberikan kepada class, enum, dan interface. 
     * Modifier private hanya bisa diberikan kepada member class.
     */
    private int id;
    private int idFood;
    private String date;
    private int totalPrice;
    private Customer customer;

    /**
     * Constructor for objects of class Invoice 
     * Constructor sama dengan metode yang dipanggil ketika sebuah objek di-instance.
     * Nama konstruktor harus sama dengan nama class , dan tidak dapat menghasilkan nilai balik 
     * dan tidak memiliki tipe nilai balik pada header metode.
     * Modifier public akan membuat member dan class bisa di akses dari mana saja.
     * 
     * @param id untuk menginisialisasikan input id baru
     * @param idFood untuk menginisialisasikan input idFood baru
     * @param date untuk menginisialisasikan input date baru
     * @param customer untuk menginisialisasikan input customer baru
     * @param total price menginisialisasikan input total harga baru
     */
    public Invoice(int id,int idFood, String date,Customer customer,int totalPrice)
    {
     /**
      * Variabel Instance
      */
     this.id = id;
     this.idFood = idFood;
     this.date = date;
     this.customer = customer;
     this.totalPrice = totalPrice;// initialise instance variables
    }
    
    /**
     * Getter id for invoice
     * @return id untuk mengecek variabel id ke variabel instance
     */
    public int getId()
    {
      return id;   
    }
    
    /**
     * Getter idFood for invoice
     * @return idFood untuk mengecek variabel idFood ke variabel instance
     */
    public int getIdFood()
    {
      return idFood;
    }
    
    /**
     * Getter Date for invoice
     * @return Date untuk mengecek variabel Date ke variabel instance
     */
    public String getDate()
    {
       return date;
    }
    
    /**
     * Getter TotalPrice for invoice
     * @return totalPrice untuk mengecek variabel TotalPrice ke Variabel instance
     */
      public int getTotalPrice()
    {
       return totalPrice;
    }
    
    /**
     * Getter Customer for invoice
     * @return customer untuk mengecek variabel customer ke variabel instance
     */
      public Customer getCustomer()
    {
      return customer;
    }
    
    /**
     * Setter id for invoice
     * @param id untuk set ke instance variabel id
     */
    public void setId(int id)
    {
      this.id = id;
    }
    /**
     * Setter idFood for invoice
     * @param idFood untuk set ke instance variabel idFood
     */
    public void setIdFood(int idFood)
    {
        this.idFood = idFood;
    }
    
    /**
     * Setter Date for Invoice
     * @param Date untuk set ke instance variabel Date 
     */
    public void setDate(String date)
    {
        this.date = date;
    }
    
    /**
     * Setter TotalPrice for Invoice
     * @param TotalPrice untuk set ke instance variabel TotalPrice
     */
    public void setTotalPrice(int totalPrice)
    {
        this.totalPrice = totalPrice;
    }
    
    /**
     * Setter Customer for Invoice
     * @param customer untuk set ke instance variabel customer
     */
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    
    /**
     * Print Data
     */
    public void printData()
    {
        
    }
    
}
