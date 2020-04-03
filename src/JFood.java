
import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * Write a description of class JFood here.
 *
 * @author Fahri Alamsyah
 * @version 02 - 04 -2020
 */
public class JFood
{
    // instance variables - replace the example below with your own


    /**
     * Constructor for objects of class JFood
     */

    public JFood()
    {
        // initialise instance variables

    }

    public static void main (String[] args) {
        Calendar calendar = Calendar.getInstance();
        GregorianCalendar cale = new GregorianCalendar(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH ), calendar.get(Calendar.DAY_OF_MONTH));

        Location location = new Location("Depok", "Jawa Barat", "Warung");

        DatabasePromo.addPromo(new Promo(1, "Promo Tahun Baru Cina", 50000, 30000, true));
        DatabasePromo.addPromo(new Promo(2, "Liburan Seekolah", 25000, 30545, true));

        System.out.println(DatabasePromo.getPromoDatabase());

        DatabaseSeller.addSeller(new Seller(1, "Fahri", "fahri@fahri.com", "0888888111", location));
        DatabaseCustomer.addCustomer(new Customer(1, "Fahri Alamsyah A", "fahrialamsyah@ui.ac.id", "Fahri1234"));
        DatabaseCustomer.addCustomer(new Customer(2, "Fahri Alamsyah B", "fahrialamsyah1@ui.ac.id", "Fahri1234"));
        DatabaseCustomer.addCustomer(new Customer(3, "Gilang", "gilang@aaaa.com", "Gilang1234"));

        for (Customer customer: DatabaseCustomer.getCustomerDatabase()) {
            System.out.println(customer.getName());
        }

        DatabaseFood.addFood(new Food(1, "Ayam Bakar", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 20000, FoodCategory.Rice));
        DatabaseFood.addFood(new Food(2, "Soto Ayam", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 10000, FoodCategory.Rice));
        DatabaseFood.addFood(new Food(3, "Sushi", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 10000, FoodCategory.Japanese));

        ArrayList<Food> riceCategory = DatabaseFood.getFoodByCategory(FoodCategory.Rice);;
        ArrayList<Food> japaneseCategory = DatabaseFood.getFoodByCategory(FoodCategory.Japanese);;

        for (Food food: riceCategory) {
            System.out.println(food.getName());
        }
        for (Food food: japaneseCategory) {
            System.out.println(food.getName());
        }

    }
}
