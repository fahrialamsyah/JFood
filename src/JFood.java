import java.util.ArrayList;

/**
 * Write a description of class CashlessInvoice here.
 *
 * @author Fahri Alamsyah
 * @version 09 - 04 -2020
 */

public class JFood
{

    /**
     * Constructor for objects of class JFood
     */

    public JFood() {
        // initialise instance variables

    }

    public static void main (String[] args) {
        Location location = new Location("Depok", "Jawa Barat", "Warung");

        try {
            DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId() + 1, "Fahri", "fahri1234@gmail.com", "08881331819", location));

            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "Fahri AlamsyahA", "fahrialamsyahA@gmail.com", "Faeerren123"));
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "Fahri AlamsyahB", "fahrialamsyahB@gmail.com", "Faerrenfahri123"));
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "Gilang A", "GilangA@gmail.com", "GilangA123"));
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "Gilang B", "GilangB@gmail.com", "GilangB123"));


            DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId() + 1, "BM50", 2000, 10000, false));

            DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Nasi Goreng Golden Lamian", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 15000, FoodCategory.Rice));
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Shihlin", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 19000, FoodCategory.Japanese));

            ArrayList<Food> riceCategory = DatabaseFood.getFoodByCategory(FoodCategory.Rice);
            ArrayList<Food> japaneseCategory = DatabaseFood.getFoodByCategory(FoodCategory.Japanese);

            DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId() + 1, riceCategory, DatabaseCustomer.getCustomerById(1)));
            Thread thread1 = new Thread(new PriceCalculator(DatabaseInvoice.getInvoiceById(DatabaseInvoice.getLastId())));
            thread1.start();
            DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId() + 1, japaneseCategory, DatabaseCustomer.getCustomerById(2)));
            Thread thread2 = new Thread(new PriceCalculator(DatabaseInvoice.getInvoiceById(DatabaseInvoice.getLastId())));
            thread2.start();
            DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId() + 1, riceCategory, DatabaseCustomer.getCustomerById(3)));
            Thread thread3 = new Thread(new PriceCalculator(DatabaseInvoice.getInvoiceById(DatabaseInvoice.getLastId())));
            thread3.start();


        } catch (EmailAlreadyExistsException e){
            System.out.println(e.getMessage());
        }
        catch (CustomerNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch (PromoCodeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        catch (SellerNotFoundException e) {
            System.out.println(e.getMessage());
        }
//
        finally {
            System.out.println("=========Customer===========");
            for (Customer customer: DatabaseCustomer.getCustomerDatabase()){
                System.out.println(customer.getName());
            }

            System.out.println("=========Promo===========");
            for (Promo promo: DatabasePromo.getPromoDatabase()){
                System.out.println(promo.getCode());
            }

            System.out.println("=========Food===========");
            for (Food food: DatabaseFood.getFoodDatabase()){
                System.out.println(food.getName());
            }
        }
    }

    private static  class PriceCalculator implements Runnable {

        Invoice input;

        PriceCalculator(Invoice input){
            this.input = input;
        }
        @Override
        public void run() {
            System.out.println("Calculating Invoice ID: " + input.getId());
            input.setTotalPrice();
            System.out.println("Finish calculating Invoice ID: " + input.getId());
        }
    }
}
