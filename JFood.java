
/**
 * Write a description of class JFood here.
 *
 * @author (Fahri Alamsyah)
 * @version (Post Test 28-02-2020)
 */
public class JFood
{
    // instance variables - replace the example below with your ow

    /**
     * Constructor for objects of class JFood
     * locat
     */
    public static void main(String[] args)
    {
        Location location1 = new Location ("Depok", "Jakarta","Bandung");
        Seller seller1 = new Seller(1706985943, "Fahri", "Fahrialamsyah231@gmail.com", "500000", location1);
        Food food1 = new Food(10, "ayam goreng", seller1, 200, FoodCategory.Snacks);
        Customer customer1 = new Customer(1,"Faerrens","Faerrens234@gmail.com","1234","28 February 2020");
        Invoice invoice1 = new Invoice(1,2,"28 February 2020",customer1,42000);
        //melakukan access method printData() ke Class tertentu
        
        //revisi PostTest Modul2
        System.out.println(seller1.getName()); //Soal no 6
        seller1.setName("gilang"); //Soal no 7
        System.out.println(seller1.getName()); // Soal no 8
        food1.printData(); //Soal no 9 
        //Soal no 10 tinggal menggunakan terminal 
        // initialise instance variables
        
    }
    
        
    
}
