
/**
 * Ini adalah class customer yang terdiri dari id, name, email , password , joinDate sebagai atribut
 * Class merupakan sebuah blueprint dari sebuah objek yang merepresentasikan konsep objek
 *
 * @author (Fahri Alamsyah)
 * @version (27-02-2020)
 */
public class Customer
{
    /**
     * Bagian dari variabel instances yang memiliki suatu atribut untuk dioperasikan.
     * Modifier private akan membuat member hanya bisa diakses oleh dari dalam class itu sendiri.
     * Perlu diingat: 
     * Modifier private tidak bisa diberikan kepada class, enum, dan interface. 
     * Modifier private hanya bisa diberikan kepada member class.
     */
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String password;
    private String joinDate;

    /**
     * Constructor for objects of class Customer
     * Constructor sama dengan metode yang dipanggil ketika sebuah objek di-instance.
     * Nama konstruktor harus sama dengan nama class , dan tidak dapat menghasilkan nilai balik 
     * dan tidak memiliki tipe nilai balik pada header metode.
     * 
     * Modifier public akan membuat member dan class bisa di akses dari mana saja.
     * @param id untuk menginisialisasikan input id baru
     * @param name untuk menginisialisasikan input name baru
     * @param email untuk menginisialisasikan input email baru
     * @param password untuk menginisialisasikan input password baru
     * @param joinDate untuk menginisialisasikan input joinDate baru
     */
    public Customer(int id, String name, String email, String password, String joinDate)
    {
        /**
         * Inisialisasi variabel instance 
         */
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
        // initialise instance variable
    }
    
    /**
     * Getter sendiri memiliki nilai kembalian sesuai dengan tipe data yang akan diambil.
     * Getter id for Customer
     * @return id untuk mengecek variabel id ke variabel instance
     */
    public int getId()
    {
        
        return id;
    }
    
    /**
     * Getter name for Customer
     * @return name untuk mengecek variabel name ke variabel instance
     */
    public String getName()
    {
        
        return name;
    }
    
    /**
     * Getter email for Customer
     * @return id untuk mengecek variabel id ke variabel instance
     */
    public String getEmail()
    {
       return email;
    }
    
    /**
     * Getter password for Customer
     * @return password untuk mengecek variabel password ke variabel instance
     */
    public String getPassword()
    {
        
       return password; 
        
    }
    
    /**
     * Getter joinDate for Customer
     * @return joinDate untuk mengecek variabel joinDate ke variabel instance
     */
    public String getJoinDate()
    {
        return joinDate;
    }
     
     /**
     * Method setter tidak memiliki nilai kembalian void (kosong). Karena tugasnya hanya untuk mengisi data ke dalam atribut. 
     * Setter id for Customer
     * @param id untuk set ke instance variabel id
     */
    public void setId(int id)
    {
        this.id = id;
    }
    
    /**
     * Setter name for Customer
     * @return name untuk mengecek variabel name ke variabel instance
     */
    public String setName(String name)
    {
        return name;
    }
    
    /**
     * Setter email for Customer
     * @return email untuk mengecek variabel email ke variabel instance
     */
    public String setEmail(String email)
    {
        return email;
    }
    
    /**
     * Setter password for Customer
     * @return password untuk mengecek variabel email ke variabel instance
     */
    public String setPassword(String password)
    {
        return password;
    }
    
    /**
     * Setter joinDate for Customer
     * @return joinDate untuk mengecek variabel email ke variabel instance
     */
    public String setJoinDate(String joindate)
    {
        return joinDate;
    }
    
    /**
     * Print data yang diinginkan 
     */
    public void printData()
    {
        System.out.println(getName());
    }
}
