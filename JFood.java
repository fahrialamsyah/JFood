

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
        Food food1 = new Food(10, "ayam goreng", seller1, 20000, FoodCategory.Snacks);
        Food food2 = new Food(2, "babi kecap", seller1, 4000, FoodCategory.Snacks);
        Customer customer1 = new Customer(1,"Faerrens","Faerrens234@gmail.com","1234","28 February 2020");
        Promo promo1 = new Promo(1,"01",2000,4000,true);
        Promo promo2 = new Promo(2,"02",2000,19000,true);
        //nvoice invoice1 = new Invoice(1,food1.getId(),"28 February 2020",customer1,20000,InvoiceStatus.Finished);
        CashlessInvoice invoice1 = new CashlessInvoice(1,food1, "30-02-2020", customer1, InvoiceStatus.Ongoing);
        CashlessInvoice invoice2 = new CashlessInvoice(2,food2, "30-02-2020", customer1, InvoiceStatus.Ongoing, promo1);
        CashlessInvoice invoice3 = new CashlessInvoice(3,food1, "30-02-2020", customer1, InvoiceStatus.Ongoing, promo2);
        //melakukan access method printData() ke Class tertentu
        //melakukan access method printData() ke Class tertentu
        
        //Post Test Modul 3
        //System.out.println(seller1.getName()); 
        //seller1.setName("gilang"); 
        //System.out.println(seller1.getName()); 
        //food1.printData();
        invoice1.setTotalPrice();
        
        invoice2.setTotalPrice();
        
        invoice3.setTotalPrice();
        invoice1.printData();
        invoice2.printData();
        invoice3.printData();
        
       
    
        
    }   
}
