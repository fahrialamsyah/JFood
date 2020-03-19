import java.util.GregorianCalendar;
/**
 * Ini adalah kelas JFood 
 *
 * @author (Fahri Alamsyah)
 * @version (Modul 5 CS 19-03-2020)
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
        Food food2 = new Food(2, "babi kecap", seller1, 3000, FoodCategory.Snacks);
       // Object Customer Tugas 3
        GregorianCalendar joinDate = new GregorianCalendar(2020, 2, 12);
        Customer customer1 = new Customer(1, "Fahri", "fahri@hotmail.com", "fahrisalasa1", joinDate);
        Customer customer2 = new Customer(2, "Faerrens", "Faerrens@gmail.com", "fahriaa5", 2013 , 03, 20);
        Customer customer3 = new Customer(3, "Faerrensiaa", "Faerrensiaa@gmail.com", "Fahri1234");
        // Print Object Customer 
        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
        System.out.println(customer3.toString());
        // Set Customer 1 Perubahan
        customer1.setEmail("fahri123@hotmail.com");
        customer1.setPassword("fahri12344");
        // Print Kembali
        System.out.println(customer1.toString());
        
        Promo promo1 = new Promo(1,"01",2000,4000,true);
        Promo promo2 = new Promo(2,"02",2000,19000,true);
        //Invoice invoice1 = new Invoice(1,food1.getId(),"28 February 2020",customer1,20000,InvoiceStatus.Finished);
        CashlessInvoice invoice1 = new CashlessInvoice(1,food1, "30-02-2020", customer1, InvoiceStatus.Ongoing);
        CashlessInvoice invoice2 = new CashlessInvoice(2,food2, "30-02-2020", customer1, InvoiceStatus.Ongoing, promo1);
        CashlessInvoice invoice3 = new CashlessInvoice(3,food1, "30-02-2020", customer1, InvoiceStatus.Ongoing, promo2);
        //melakukan access method printData() ke Class tertentu
        //melakukan access method printData() ke Class tertentu
        
        //Post Test Modul 4
        CashInvoice cash1 = new CashInvoice(4, food1, "30-02-2020", customer1, InvoiceStatus.Finished);
        cash1.setTotalPrice();
        CashInvoice cash2 = new CashInvoice(5, food1, "30-02-2020", customer1, InvoiceStatus.Finished, 10000);
        cash2.setTotalPrice();
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
        cash1.printData();
        cash2.printData();
        
       
    
        
    }
    
     public String toString()
    {
        return null;
    }
}