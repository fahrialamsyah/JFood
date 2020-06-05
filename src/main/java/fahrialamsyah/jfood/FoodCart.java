package fahrialamsyah.jfood;
import java.util.ArrayList;
/**
 * <h1>FoodCart<h1>
 * Kelas ini berfungsi untuk mendapatkan dan memberikan nilai pada obyek foodCart
 * dengan memanfaatkan method constructor, mutator, dan accessor
 *
 * @author Fahri Alamsyah
 * @version 30-05-2020
 *
 */
public class FoodCart {
    // instance variables - replace the example below with your own
    private Customer customer;
    private int FoodId;
    private String FoodName;
    private int FoodPriceTimesQuantity;
    private int Quantity;

    /**
     * Sebuah constructor pada kelas awal yang akan memberikan nilai ketika
     * method ini dipanggil dengan menginisiasikan nilai awal sesuai dengan
     * parameternya
     *
     * @param customer memasukkan objek customer
     * @param id memberi nilai berupa id nama dengan tipe data int
     * @param name memberi nilai berupa nama dengan tipe data string
     * @param price memberi nilai berupa harga dengan tipe data int
     * @param quantity memberi nilai berupa kuantitas dengan tipe data int
     */
    public FoodCart (Customer customer, int id, String name, int price, int quantity)
    {
        this.customer = customer;
        this.FoodId = id;
        this.FoodName = name;
        this.FoodPriceTimesQuantity = price;
        this.Quantity = quantity;
    }

    /**
     * Method getCustomer merupakan method getter untuk obyek customer
     * @return Customer akan mengembalikan nilai customer ketika method ini
     * dipanggil
     */
    public Customer getCustomer()
    {
        return customer;
    }

    /**
     * Method setCustomer merupakan method setter untuk obyek customer
     * @param customer untuk mengisi data berupa tipe data customer ke dalam variabel customer
     * @return tidak ada
     */
    public void setCustomer(Customer customer)
    {
        this.customer=customer;
    }
    /**
     * Method setFoodId merupakan method setter untuk variabel FoodId
     * @param FoodId untuk mengisi data berupa tipe data int ke dalam variabel FoodId
     * @return tidak ada
     */
    public void setFoodId(int FoodId)
    {
        this.FoodId=FoodId;
    }
    /**
     * Method getFoodId merupakan method getter untuk variabel FoodId
     * @return <code>int<code> akan mengembalikan nilai FoodId ketika method ini
     * dipanggil
     */
    public int getFoodId()
    {
        return FoodId;
    }

    /**
     * Method setFoodName merupakan method setter untuk variabel Foodname
     * @param FoodName untuk mengisi data berupa tipe data String ke dalam variabel FoodName
     * @return tidak ada
     */
    public void setFoodName(String FoodName)
    {
        this.FoodName=FoodName;
    }

    /**
     * Method getFoodName merupakan method getter untuk variabel FoodName
     * @return <code>String<code> akan mengembalikan nilai FoodName ketika method ini
     * dipanggil
     */
    public String getFoodName()
    {
        return FoodName;
    }

    /**
     * Method setFoodPriceTimesQuantity merupakan method setter untuk variabel FoodPriceTimesQuantity
     * @param FoodPriceTimesQuantity untuk mengisi data berupa tipe data int ke dalam variabel FoodPriceTimesQuantity
     * @return tidak ada
     */

    public void setFoodPriceTimesQuantity(int FoodPriceTimesQuantity)
    {
        this.FoodPriceTimesQuantity=FoodPriceTimesQuantity;
    }

    /**
     * Method getFoodPriceTimesQuantity merupakan method getter untuk variabel FoodPriceTimesQuantity
     * @return <code>int<code> akan mengembalikan nilai FoodPriceTimesQuantity ketika method ini
     * dipanggil
     */
    public int getFoodPriceTimesQuantity()
    {
        return FoodPriceTimesQuantity;
    }
    /**
     * Method setQuantity merupakan method setter untuk variabel Quantity
     * @param Quantity untuk mengisi data berupa tipe data int ke dalam variabel Quantity
     * @return tidak ada
     */
    public void setQuantity(int Quantity)
    {
        this.Quantity=Quantity;
    }
    /**
     * Method getQuantity merupakan method getter untuk variabel Quantity
     * @return <code>int<code> akan mengembalikan nilai Quantity ketika method ini
     * dipanggil
     */
    public int getQuantity()
    {
        return Quantity;
    }

}
