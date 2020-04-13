import javax.swing.plaf.synth.SynthTextAreaUI;
import javax.xml.crypto.Data;
import java.awt.*;
import java.util.*;

/**
 * Write a description of class JFood here.
 *
 * @author Fahri Alamsyah
 * @version 09 - 04 - 2020
 */

public class JFood
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class JFood
     */
    public JFood()
    {
        // initialise instance variable

    }

    public static void main(String[] args){
        Location location = new Location("Depok","Jawa Barat","Warung");
        DatabaseSeller.addSeller((new Seller(DatabaseSeller.getLastId()+1 ,"Fahri Alamsyah","fahrialamsyah231@gmail.com", "08881331819", location)));
        try {
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "Fahri AlamsyahA", "fahrialamsyahA@gmail.com", "Faerrenss1234"));
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "Fahri AlamsyahB", "fahrialamsyahB@gmail.com", "FaerrensFahri1234"));
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "Gilang A", "GilangA@gmail.com", "GilangA123"));
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "Gilang B", "GilangB@gmail.com", "GilangB123"));
        }
        catch( EmailAlreadyExistsException e){
            System.out.println(e.getMessage());
        }

        try{
            DatabaseFood.addFood(new Food( DatabaseFood.getLastId(),"Nasi Goreng Golden Lamian", DatabaseSeller.getSellerById(1),50000,FoodCategory.Rice));
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId(),"Shihlin",DatabaseSeller.getSellerById(1),43000,FoodCategory.Snacks));
        }
        catch(SellerNotFoundException e){
            System.out.println(e.getMessage());
        }

        try {
            DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId() + 1, "BM50", 50000, 100000, false));
            DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId() + 1, "BM40", 40000, 200000, false));
        }
        catch(PromoCodeAlreadyExistsException e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(DatabaseCustomer.getCustomerById(4).toString());
        }
        catch(CustomerNotFoundException e){
            System.out.println(e.getMessage());

        }

        try {
            System.out.println(DatabaseFood.getFoodById(2).toString());
        }
        catch(FoodNotFoundException e){
            System.out.println(e.getMessage());

        }

        try {
            System.out.println(DatabaseSeller.getSellerById(2).toString());
        }
        catch(SellerNotFoundException e){
            System.out.println(e.getMessage());

        }

        try {
            System.out.println(DatabasePromo.getPromoById(2).toString());
        }
        catch(PromoNotFoundException e){
            System.out.println(e.getMessage());

        }

        for ( int i=0 ; i<DatabasePromo.getPromoDatabase().size(); i++) {

            System.out.println(DatabasePromo.getPromoDatabase().get(i).toString());
        }
        for ( int i=0 ; i<DatabaseCustomer.getCustomerDatabase().size(); i++) {

            System.out.println(DatabaseCustomer.getCustomerDatabase().get(i).toString());
        }
        for ( int i=0 ; i<DatabaseFood.getFoodDatabase().size(); i++) {

            System.out.println(DatabaseFood.getFoodDatabase().get(i).toString());
        }
        for ( int i=0 ; i<DatabaseSeller.getSellerDatabase().size(); i++) {

            System.out.println(DatabaseSeller.getSellerDatabase().get(i).toString());
        }

        ArrayList<Food> newFood1 = new ArrayList<Food>();
        newFood1.add(DatabaseFood.getFoodDatabase().get(0));
        newFood1.add(DatabaseFood.getFoodDatabase().get(1));
        newFood1.add(DatabaseFood.getFoodDatabase().get(1));

        ArrayList<Food> newFood2 = new ArrayList<Food>();
        newFood2.add(DatabaseFood.getFoodDatabase().get(0));
        newFood2.add(DatabaseFood.getFoodDatabase().get(1));
        newFood2.add(DatabaseFood.getFoodDatabase().get(1));
        newFood2.add(DatabaseFood.getFoodDatabase().get(0));
        newFood2.add(DatabaseFood.getFoodDatabase().get(1));
        newFood2.add(DatabaseFood.getFoodDatabase().get(1));

        ArrayList<Food> newFood3 = new ArrayList<Food>();
        newFood3.add(DatabaseFood.getFoodDatabase().get(0));
        newFood3.add(DatabaseFood.getFoodDatabase().get(1));
        newFood3.add(DatabaseFood.getFoodDatabase().get(1));
        newFood3.add(DatabaseFood.getFoodDatabase().get(0));
        newFood3.add(DatabaseFood.getFoodDatabase().get(1));
        newFood3.add(DatabaseFood.getFoodDatabase().get(0));
        newFood3.add(DatabaseFood.getFoodDatabase().get(1));
        try {
            DatabaseInvoice.addInvoice(new CashInvoice(DatabaseInvoice.getLastId() + 1, newFood1, DatabaseCustomer.getCustomerById(1), 10001));
            DatabaseInvoice.addInvoice(new CashInvoice(DatabaseInvoice.getLastId() + 1, newFood2, DatabaseCustomer.getCustomerById(2), 10002));
            DatabaseInvoice.addInvoice(new CashInvoice(DatabaseInvoice.getLastId() + 1, newFood3, DatabaseCustomer.getCustomerById(3), 10003));
        }
        catch(CustomerNotFoundException a){
            System.out.println(a.getMessage());
        }

        //THREAD
        System.out.println("");
        PriceCalculator calcu1 = new PriceCalculator(DatabaseInvoice.getInvoiceDatabase().get(0));
        PriceCalculator calcu2 = new PriceCalculator(DatabaseInvoice.getInvoiceDatabase().get(1));
        PriceCalculator calcu3 = new PriceCalculator(DatabaseInvoice.getInvoiceDatabase().get(2));
        Thread thread1 = new Thread(calcu1);
        thread1.start();
        Thread thread2 = new Thread(calcu2);
        thread2.start();
        Thread thread3 = new Thread(calcu3);
        thread3.start();

    }
}
