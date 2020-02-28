
/**
 * Ini adalah Class invoice yang terdiri dari id, name, seller, price, category.
 * Class merupakan sebuah blueprint dari sebuah objek yang merepresentasikan konsep objek
 *
 * @author (Fahri Alamsyah)
 * @version (27-07-2020)
 */
public class Food
{
    /**
     * Bagian dari Variabel instances
     * Modifier private akan membuat member hanya bisa diakses oleh dari dalam class itu sendiri.
     * Perlu diingat: 
     * Modifier private tidak bisa diberikan kepada class, enum, dan interface. 
     * Modifier private hanya bisa diberikan kepada member class.
     */// instance variables - replace the example below with your own
    private int id;
    private String name;
    private Seller seller;
    private int price;
    private String category;
   
    /**
     * Constructor for objects of class Food
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
    
    public Food(int id,String name, Seller seller, int price, String category )
    {
        
        /**
         * Variabel Instance untuk parameter
         */
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        // initialise instance variables
        
    }
   
     /**
     * Getter id for Food
     * @return id untuk mengecek variabel id ke variabel instance
     */
    public int getId()
    {
        return id;
    }
    
    /** Getter Name for Food
    * @return Name untuk mengecek variabel Name ke variabel instance
    */
    public String getName()
    {
        return name;
    }
    
    /** Getter Seller for Food
    * @return seller untuk mengecek variabel seller ke variabel instance
    */
    public Seller getSeller()
    {
        return seller;
    }
    
    /** Getter Price for Food
    * @return Price untuk mengecek variabel Price ke variabel instance
    */
    public int getPrice()
    {
        return price;
    }
    
    /** Getter Category for Food
    * @return Category untuk mengecek variabel Category ke variabel instance
    */
    public String getCategory()
    {
        return category;
    }
    
     /**
     * Setter id for Food
     * @param id untuk set ke instance variabel id
     */
    public void setId(int id)
    {
        this.id =id;
    }
    
    /**
     * Setter Name for Food
     * @param Name untuk set ke instance variabel Name
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * Setter seller for food
     * @param seller untuk set ke instance variabel seller
     */
    public void setSeller(Seller seller)
    {
        this.seller = seller;
    }
    
    /**
     * Setter Price for food
     * @param Price untuk set ke instance variabel Price
     */
    public void setPrice(String setPrice)
    {
        this.price = price;
    }
    
    /**
     * Setter Category for food
     * @param Category untuk set ke instance variabel Category
     */
    public void setCategory(String category)
    {
        this.category = category;
    }
    
    /**
     * Print Data
     */
    public void printData()
    {
        System.out.println(getName());
    }
    
    
}
