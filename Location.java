
/**
 * Ini adalah Class Location yang terdiri dari province, description, city sebagai atribut
 * Class merupakan sebuah blueprint dari sebuah objek yang merepresentasikan konsep objek
 * @author (Fahri Alamsyah)
 * @version (27-02-2020)
 */
public class Location
{
    /**
     * Bagian dari Variabel instances
     * Modifier private akan membuat member hanya bisa diakses oleh dari dalam class itu sendiri.
     * Perlu diingat: 
     * Modifier private tidak bisa diberikan kepada class, enum, dan interface. 
     * Modifier private hanya bisa diberikan kepada member class.
     */
    // instance variables - replace the example below with your own
    private String province;
    private String description;
    private String city;
    

    /**
     * Constructor for objects of class Location
     * Constructor sama dengan metode yang dipanggil ketika sebuah objek di-instance.
     * Nama konstruktor harus sama dengan nama class , dan tidak dapat menghasilkan nilai balik 
     * dan tidak memiliki tipe nilai balik pada header metode.
     * Modifier public akan membuat member dan class bisa di akses dari mana saja.
     * 
     * @param city untuk menginisialisasikan input city baru
     * @param province untuk menginisialisasikan input province baru
     * @param description untuk menginisialisasikan input description baru
     *
     */
    public Location(String province, String description, String city)
    {
        /**
         * Variabel Instance
         */
        // initialise instance variables
        this.city = city;
        this.province = province;
        this.description = description;
    }
    
    /**
     * Getter Province for Location
     * @return province untuk mengecek variabel province ke variabel instance
     */
    public String getProvince()
    {
        return province;
    }
    
     /**
     * Getter City for Location
     * @return City untuk mengecek variabel City ke variabel instance
     */
    public String getCity()
    {
        return city;
    }
    
     /**
     * Getter description for Location
     * @return description untuk mengecek variabel description ke variabel instance
     */
    public String getdescription()
    {
        return description;
    }
    
    /**
     * Setter province for Location
     * @param province untuk set ke instance variabel province
     */
    public void setProvince(String province)
    {
        this.province = province;
    }
    
    /**
     * Setter city for Location
     * @param city untuk set ke instance variabel city
     */
    public void setCity(String city)
    {
        this.city = city;
    }
    
    /**
     * Setter description for Location
     * @param city untuk set ke instance variabel city
     */
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    /**
     * Print Data
     */
    public void printData()
    {
        System.out.println(getProvince());
    }
    
  
}
