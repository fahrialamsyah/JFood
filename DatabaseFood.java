
/**
 * Ini adalah Class Database Food
 * Class merupakan sebuah blueprint dari sebuah objek yang merepresentasikan konsep objek
 * @author (Fahri Alamsyah)
 * @version (27-02-2020)
 */
public class DatabaseFood
{
    /**
     * Bagian dari Variabel instances
     * Modifier private akan membuat member hanya bisa diakses oleh dari dalam class itu sendiri.
     * Perlu diingat: 
     * Modifier private tidak bisa diberikan kepada class, enum, dan interface. 
     * Modifier private hanya bisa diberikan kepada member class.
     */
    // instance variables - replace the example below with your own
    private String[] listFood;

    /**
     * Constructor for objects of class DatabaseFood
     */
    public DatabaseFood ()
    {
        // initialise instance variables
    }
    
    /**
     * Hanya memiliki dua nilai valid yakni true dan false. 
     * Nilai boolean tidak dapat dikonversi menjadi tipe data lain,
     * atau tipe data lain juga tidak dapat dikonversi menjadi sebuah 
     * nilai boolean. Kata True dan False merupakan kata kunci dalam Java sebagai literal
     * Boolean dan tidak dapat digunakan diluar konteks ini.
     * 
     */
    public boolean addFood(Food food)
    {
        return true;
    }
    
    /**
     * Hanya memiliki dua nilai valid yakni true dan false. 
     * Nilai boolean tidak dapat dikonversi menjadi tipe data lain,
     * atau tipe data lain juga tidak dapat dikonversi menjadi sebuah 
     * nilai boolean. Kata True dan False merupakan kata kunci dalam Java sebagai literal
     * Boolean dan tidak dapat digunakan diluar konteks ini.
     * 
     */
    public boolean removeFood(Food food)
    {
        return true;
    }
    
      /**
     * Getter ListFood for DatabaseFood
     * @return listfood untuk mengecek variabel listfood ke variabel instance
     */
    public String[] getListFood()
    {
        return listFood;
    }
    
}
