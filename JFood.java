
/**
 * Write a description of class JFood here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
        Food food1 = new Food(10, "ayam goreng", seller1, 200, "indonesia");
        Customer customer1 = new Customer(1,"Faerrens","Faerrens234@gmail.com","1234","28 February 2020");
        Invoice invoice1 = new Invoice(1,2,"28 February 2020",customer1,42000);
        Seller seller2 = new Seller(10,"Gilang", "Gilang12@gmail.com","5000000", location2);
        //melakukan access method printData() ke Class tertentu

        seller1.printData(); 
        location1.printData();
        food1.printData();
        customer1.printData();
        invoice1.printData();
        // initialise instance variables
        
    }
    
     public void printData()
    {
        System.out.println(getSeller());
    }
        
    
}
