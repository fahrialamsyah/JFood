import java.util.ArrayList;
/**
 * Write a description of class DatabaseCustomer here.
 *
 * @author Fahri Alamsyah
 * @version 13 - 04 -2020
 */
public class JFood {

    /**
     * Constructor for objects of class JFood
     */

    public JFood() {
        // initialise instance variables

    }

    public static void main(String[] args) {
        Location location = new Location("Depok", "Jawa Barat", "Warung");

        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId() + 1, "Fahri", "FahriAlamsyah231@gmail.com", "0821212121", location));

        try {
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "FahriA", "fahriA@gmail.com", "FahriA123"));
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "FahriB", "fahriB@gmail.com", "Faerren123"));
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "GilangA", "GilangA@gmail.com", "Gilang123"));
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "GilangB", "GilangB@gmail.com", "Gilangg123"));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        try {
            DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId() + 1, "BM50", 2000, 10000, false));
            DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId() + 1, "BM40", 5000, 10000, true));
        } catch (PromoCodeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        try {
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Nasi Goreng Golden Lamian", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 20000, FoodCategory.Rice));
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Sushi", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 20000, FoodCategory.Japanese));
        } catch (SellerNotFoundException e) {
            System.out.println(e.getMessage());
        }

        ArrayList<Food> riceCategory = DatabaseFood.getFoodByCategory(FoodCategory.Rice);
        ArrayList<Food> japaneseCategory = DatabaseFood.getFoodByCategory(FoodCategory.Japanese);

        try {
            DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId() + 1, riceCategory, DatabaseCustomer.getCustomerById(1)));
            DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId() + 1, japaneseCategory, DatabaseCustomer.getCustomerById(1)));


            for (Invoice invoice : DatabaseInvoice.getInvoiceDatabase()) {
                new Thread(new PriceCalculator(invoice)).start();
            }
        } catch (CustomerNotFoundException | OngoingInvoiceAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        try {
            DatabaseCustomer.getCustomerById(100);
        } catch (CustomerNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            DatabaseFood.getFoodById(100);
        } catch (FoodNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            DatabaseSeller.getSellerById(100);
        } catch (SellerNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabasePromo.getPromoById(100);

        } catch (PromoNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("=========Customer===========");
        for (Customer customer : DatabaseCustomer.getCustomerDatabase()) {
            System.out.println(customer.getName());
        }

        System.out.println("=========Promo===========");
        for (Promo promo : DatabasePromo.getPromoDatabase()) {
            System.out.println(promo.getCode());
        }

        System.out.println("=========Food===========");
        for (Food food : DatabaseFood.getFoodDatabase()) {
            System.out.println(food.getName());
        }
        System.out.println();
    }
}