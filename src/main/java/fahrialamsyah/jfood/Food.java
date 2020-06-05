package fahrialamsyah.jfood;
import java.util.ArrayList;

/**
 * <h1>Food<h1>
 * Kelas ini berfungsi untuk mendapatkan dan memberikan nilai pada obyek food
 * dengan memanfaatkan method constructor, mutator, dan accessor
 *
 * @author Fahri Alamsyah
 * @version 27-February-2020
 *
 */
public class Food {

    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private int price;
    private Seller seller;
    private FoodCategory category;


    /**
     * Sebuah constructor pada kelas awal yang akan memberikan nilai ketika
     * method ini dipanggil dengan menginisiasikan nilai awal sesuai dengan
     * parameternya
     *
     * @param id memberi nilai berupa id dengan tipe data int
     * @param name memberi nilai berupa nama dengan tipe data string
     * @param price memberi nilai berupa harga dengan tipe data int
     * @param category memberi nilai berupa kategori dengan tipe data string
     * @param Seller memasukkan obyek seller
     */
    public Food(int id, String name, Seller seller, int price, FoodCategory category)
    {
        //Kata kunci this digunakan untuk mereferensikan obyek saat ini yaitu food
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.seller = seller;
    }

    /**
     * Method getID merupakan method getter untuk variabel id
     * @return <code>int<code> akan mengembalikan nilai id ketika method ini
     * dipanggil
     */
    public int getId(){
        return id;
    }

    /**
     * Method getName merupakan method getter untuk variabel Name
     * @return <code>String<code> akan mengembalikan nilai Name ketika method ini
     * dipanggil
     */
    public String getName(){
        return name;
    }

    /**
     * Method getPrice merupakan method getter untuk variabel Price
     * @return <code>int<code> akan mengembalikan nilai Price ketika method ini
     * dipanggil
     */
    public int getPrice(){
        return price;
    }

    /**
     * Method getCategory merupakan method getter untuk variabel Category
     * @return <code>String<code> akan mengembalikan nilai Category ketika method ini
     * dipanggil
     */
    public FoodCategory getCategory(){
        return category;
    }

    /**
     * Method getSeller merupakan method getter untuk obyek seller
     * @return <code>Seller<code> akan mengembalikan nilai Seller ketika method ini
     * dipanggil
     */
    public Seller getSeller(){
        return seller;
    }

    /**
     * Method setID merupakan method setter untuk variabel id
     * @param id untuk mengisi data berupa tipe data int ke dalam variabel id
     * @return tidak ada
     */
    public void setId(int id){
        this.id = id;
    }

    /**
     * Method setName merupakan method setter untuk variabel name
     * @param name untuk mengisi data berupa tipe data String ke dalam variabel name
     * @return tidak ada
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Method setPrice merupakan method setter untuk variabel price
     * @param price untuk mengisi data berupa tipe data int ke dalam variabel price
     * @return tidak ada
     */
    public void setPrice(int price){
        this.price=price;
    }

    /**
     * Method setCategory merupakan method setter untuk variabel category
     * @param category untuk mengisi data berupa tipe data string ke dalam variabel category
     * @return tidak ada
     */
    public void setCategory(FoodCategory category){
        this.category = category;
    }

    /**
     * Method setSeller merupakan method setter untuk obyek seller
     * @param seller untuk mengisi data berupa tipe data Seller ke dalam variabel seller
     * @return tidak ada
     */
    public void setSeller(Seller seller){
        this.seller = seller;
    }
    /**
     * Method ini berfungsi untuk mencetak semua variable yang telah di set oleh method setter
     */
    public String toString (){
        return "Id = " +id+ "\nNama= " +name+ "\nSeller= " +seller.getName()+ "\nCity= " +seller.getLocation().getCity()+ "\nPrice= " +price+ "\nCategory= " +category;
    }


}

