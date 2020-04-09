import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.xml.crypto.Data;
import java.util.*;
import java.util.regex.*;
import java.lang.Object;
import java.text.Format;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
/**
 * Write a description of class JFood here.
 *
 * @author Fahri Alamsyah
 * @version 08-04-2020
 */


public class JFood
{
    public static void main (String[] args)
    {
        Location location1 = new Location("Depok", "Jawa Barat", "Warung");
        Seller seller1 = new Seller(1, "Fahri", "fahrialamsyah@gmail.com", "08881223344", location1);
        Promo promo1 = new Promo(1, "BM50", 5000, 20000, true);


        Calendar tanggal = Calendar.getInstance();
        DatabaseCustomer.addCustomer(new Customer(1, "Fahri Alamsyah A", "Fahrialamsyah@gmail.com", "Fahri1234", tanggal));
        DatabaseCustomer.addCustomer(new Customer(2, "Fahri Alamsyah B", "fahrialamsyah1@gmail.com", "Fahri1234", tanggal));
        DatabaseCustomer.addCustomer(new Customer(3, "Gilang", "gilang@aaaa.com", "Gilang1234", tanggal));

        DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId() + 1, "BM50", 5000, 10000, true));
        DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId() + 1, "BM50", 5000, 10000, false));

       // DatabaseFood.addFood(new Food(1, "Ayam Bakar", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 20000, FoodCategory.Rice));
        //DatabaseFood.addFood(new Food(2, "Soto Ayam", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 10000, FoodCategory.Rice));
        //DatabaseFood.addFood(new Food(3, "Sushi", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 10000, FoodCategory.Japanese));

        //ArrayList<Food> riceCategory = DatabaseFood.getFoodByCategory(FoodCategory.Rice);;
        //ArrayList<Food> japaneseCategory = DatabaseFood.getFoodByCategory(FoodCategory.Japanese);;

        //for (Food food: riceCategory) {
         //   System.out.println(food.getName());
       // }
        //for (Food food: japaneseCategory) {
          //  System.out.println(food.getName());
       // }

        System.out.println("\n Daftar Promo Yang Ada : ");
        for (Promo promo : DatabasePromo.getPromoDatabase())
        {
            System.out.println(promo);
            System.out.println("");
        }

        ArrayList<Food> foods1 = new ArrayList<>();
        foods1.add(DatabaseFood.getFoodById(1));
        ArrayList<Food> foods2 = new ArrayList<>();
        foods2.add(DatabaseFood.getFoodById(1));
        foods2.add(DatabaseFood.getFoodById(2));

        DatabaseInvoice.addInvoice(new CashInvoice(DatabaseInvoice.getLastId()+1, foods1, DatabaseCustomer.getCustomerById(1),5000));
        DatabaseInvoice.getInvoiceByCustomer(1).get(DatabaseInvoice.getInvoiceByCustomer(1).size()-1).setTotalPrice();

        DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId()+1, foods2, DatabaseCustomer.getCustomerById(1)));
        DatabaseInvoice.getInvoiceByCustomer(1).get(DatabaseInvoice.getInvoiceByCustomer(1).size()-1).setTotalPrice();

        for(Invoice invoice : DatabaseInvoice.getInvoiceDatabase()) {
            System.out.println(invoice);
            System.out.println();
        }
        DatabaseInvoice.changeInvoiceStatus(DatabaseInvoice.getInvoiceByCustomer(1).get(DatabaseInvoice.getInvoiceByCustomer(1).size()-1).getId(),InvoiceStatus.Finished);

        DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId()+1, foods2, DatabaseCustomer.getCustomerById(2), DatabasePromo.getPromoByCode("AAA")));
        DatabasePromo.activatePromo(1);

        for(Invoice invoice : DatabaseInvoice.getInvoiceDatabase())
        {
            invoice.setTotalPrice();
            System.out.println(invoice);
            System.out.println();
        }

    }
}