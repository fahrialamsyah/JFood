
/**
 * Ini adalah class Seller yang terdiri dari id, name, email, phoneNumber, Customer sebagai atribut
 * Class merupakan sebuah blueprint dari sebuah objek yang merepresentasikan konsep objek
 *
 * @author Fahri Alamsyah
 * @version 27-02-2020 - 19-03-2020
 */
public class Seller
{
    /**
     * Bagian dari Variabel instances
     * Modifier private akan membuat member hanya bisa diakses oleh dari dalam class itu sendiri.
     * Perlu diingat: 
     * Modifier private tidak bisa diberikan kepada class, enum, dan interface. 
     * Modifier private hanya bisa diberikan kepada member class.
     */
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;

    /**
     * Constructor for objects of class Seller
     * Constructor sama dengan metode yang dipanggil ketika sebuah objek di-instance.
     * Nama konstruktor harus sama dengan nama class , dan tidak dapat menghasilkan nilai balik 
     * dan tidak memiliki tipe nilai balik pada header metode.
     * Modifier public akan membuat member dan class bisa di akses dari mana saja.
     *
     * @param id untuk menginisialisasikan input id baru
     * @param name untuk menginisialisasikan input name baru
     * @param email untuk menginisialisasikan input email baru
     * @param phoneNumber untuk menginisialisasikan input phoneNumber baru
     * @param location menginisialisasikan input total location baru
     */
    public Seller(int id, String name, String email, String phonenumber, Location location)
    {
        /**
         * Variabel Instance
         */
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;  
        // initialise instance variables
    }
    
     /**
     * Getter sendiri memiliki nilai kembalian sesuai dengan tipe data yang akan diambil.
     * Getter id for Seller
     * @return id untuk mengecek variabel id ke variabel instance
     */
    public int getId()
    {
        return id;
    }
    
     /**
     * Getter name for Seller
     * @return name untuk mengecek variabel name ke variabel instance
     */
    public String getName()
    {
        return name;
    }
    
     /**
     * Getter email for Seller
     * @return email untuk mengecek variabel email ke variabel instance
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * Getter PhoneNumber for Seller
     * @return PhoneNumber untuk mengecek variabel PhoneNumber ke variabel instance
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
     /**
     * Getter Location for Seller
     */
    public Location getLocation()
    {
        return location;
    }
    
    /**
     * Setter id for Seller
     * @param id untuk set ke instance variabel id
     */
    public void setId(int id)
    {
       this.id = id;
    }
    
    /**
     * Setter Name for Seller
     * @param Name untuk set ke instance variabel name 
     */
      public void setName(String name)
    {
       this.name = name ;
    }
    
     /**
     * Setter Email for Seller
     * @param Email untuk set ke instance variabel email 
     */
      public void setEmail(String email)
    {
       this.email = email; 
    }
    
     /**
     * Setter PhoneNumber for Seller
     * @param PhoneNumber untuk set ke instance variabel PhoneNumber 
     */
      public void setPhoneNumber(String phonenumber)
    {
        this.phoneNumber = phoneNumber;
    }
    
    /**
     * Setter Location for Seller
     * @param Location untuk set ke instance variabel Location 
     */
      public void setLocation(Location location)
    {
       this.location = location;
    }
    
    public String toString()
    {
        return "=========Food========\n" +
        "Id : " + getId() + "\n" +
        "Nama : " + getName() + "\n"+
        "Phone Number : " + getPhoneNumber() + "\n"+
        "Location : "  +  getLocation() + "\n"+"\n"; 
    }
    
    /**
     * Print Data
     */  
    public void printData()
    {
        System.out.println(getName());
    }
          
}
