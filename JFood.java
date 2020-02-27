
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
     */
    public static void main(String[] args)
    {
        Location location1 = new Location ("Depok", "Jakarta","Bandung");
        
        
        Seller seller1 = new Seller(5678, "Fahri", "Fahrialamsyah231@gmail.com", "500000", location1);
        
        
        Food food1 = new Food(10, "ayam goreng", seller1, 200, "indonesia");
        
        seller1.printData(); 
        
        // initialise instance variables
        
    }

   
}
