
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
    private static String[] listFood;

    /**
     * Constructor for objects of class DatabaseFood
     */
    
    
    /**
     * Hanya memiliki dua nilai valid yakni true dan false. 
     * Nilai boolean tidak dapat dikonversi menjadi tipe data lain,
     * atau tipe data lain juga tidak dapat dikonversi menjadi sebuah 
     * nilai boolean. Kata True dan False merupakan kata kunci dalam Java sebagai literal
     * Boolean dan tidak dapat digunakan diluar konteks ini.
     * 
     */
    public static boolean addFood(Food food)
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
    public static boolean removeFood(Food food)
    {
        return true;
    }
    
    public static void getFood(Food food)
    {
        
    }
    
      /**
     * Getter ListFood for DatabaseFood
     * @return listfood untuk mengecek variabel listfood ke variabel instance
     */
    public static String[] getListFood()
    {
        return listFood;
    }
    
}
