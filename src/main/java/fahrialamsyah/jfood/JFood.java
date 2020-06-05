package fahrialamsyah.jfood;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * <h1>JFood<h1>
 * Kelas ini berfungsi untuk menjalankan main program yang berisi data seller dan food maupun promo
 *
 * @author Fahri Alamsyah
 * @version 27-February-2020
 *
 */
@SpringBootApplication
public class JFood
{

    /**
     * Constructor for objects of class JFood
     */

    public JFood() {

    }

    public static void main (String[] args) throws FoodNotFoundException {
        SpringApplication.run(JFood.class, args);
        Location location = new Location("Depok", "Jawa Barat", "Rumah");

        try {

            DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId() + 1, "Alamsyah", "alamsyah@gmail.com", "0821212121", location));
            DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId() + 1, "Faerrens", "faerrens@gmail.com", "0821212121", location));
            DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId() + 1, "Chily", "chily@gmail.com", "0821212121", location));
            DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId() + 1, "Vika", "vika@gmail.com", "0821212121", location));
            DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId() + 1, "Viki", "viki@gmail.com", "0821212121", location));
            DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId() + 1, "Bilqis", "bilqis@gmail.com", "0821212121", location));

            DatabaseFood.addFood(new Food(DatabaseFood.getLastid() + 1, "Rawon", DatabaseSeller.getSellerById(1), 20000, FoodCategory.Rice));
            DatabaseFood.addFood(new Food(DatabaseFood.getLastid() + 1, "Tempura", DatabaseSeller.getSellerById(1), 20000, FoodCategory.Japanese));
            DatabaseFood.addFood(new Food(DatabaseFood.getLastid() + 1, "Nasi Goreng", DatabaseSeller.getSellerById(6), 20000, FoodCategory.Japanese));
            DatabaseFood.addFood(new Food(DatabaseFood.getLastid() + 1, "Martabak", DatabaseSeller.getSellerById(2), 20000, FoodCategory.Japanese));
            DatabaseFood.addFood(new Food(DatabaseFood.getLastid() + 1, "Piscok", DatabaseSeller.getSellerById(3), 20000, FoodCategory.Japanese));
            DatabaseFood.addFood(new Food(DatabaseFood.getLastid() + 1, "Ramen", DatabaseSeller.getSellerById(3), 20000, FoodCategory.Japanese));
            DatabaseFood.addFood(new Food(DatabaseFood.getLastid() + 1, "Chicken Katsu", DatabaseSeller.getSellerById(4), 20000, FoodCategory.Japanese));
            DatabaseFood.addFood(new Food(DatabaseFood.getLastid() + 1, "Beef", DatabaseSeller.getSellerById(4), 20000, FoodCategory.Japanese));
            DatabaseFood.addFood(new Food(DatabaseFood.getLastid() + 1, "Fuyung Hai", DatabaseSeller.getSellerById(5), 20000, FoodCategory.Japanese));
            DatabaseFood.addFood(new Food(DatabaseFood.getLastid() + 1, "Cumi Goreng Tepung", DatabaseSeller.getSellerById(6), 20000, FoodCategory.Japanese));



            ArrayList<Food> riceCategory = DatabaseFood.getFoodByCategory(FoodCategory.Rice);
            ArrayList<Food> japaneseCategory = DatabaseFood.getFoodByCategory(FoodCategory.Japanese);

            DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId() + 1, "BM40", 10000, 5000, true));
        }
        catch (SellerNotFoundException e) {
            System.out.println(e.getMessage());
        }catch (PromoCodeAlreadyExistsException e){
            System.out.println(e.getMessage());
        }


    }
}



