package fahrialamsyah.jfood;
/**
 * <h1>Promo<h1>
 * Kelas ini berfungsi untuk mendapatkan dan memberikan nilai pada obyek Promo
 * dengan memanfaatkan method constructor, mutator, dan accessor
 *
 * @author Fahri Alamsyah
 * @version 27-February-2020
 *
 */
public class Promo
{
    //Atribut yang digunakan pada kelas ini dengan access modifier private
    private int id;
    private String code;
    private int discount;
    private int minPrice;
    private boolean active;
    /**
     * Sebuah constructor pada kelas awal yang akan memberikan nilai ketika
     * method ini dipanggil dengan menginisiasikan nilai awal sesuai dengan
     * parameternya
     *
     * @param id memberi nilai berupa id dengan tipe data int
     * @param code memberi nilai berupa code dengan tipe data string
     * @param discount memberi nilai berupa discount atau potongan harga dengan tipe data int
     * @param minPrice memberi nilai berupa minPrice atau harga minimal agar promo dapat digunakan dengan tipe data int
     * @param active mengetahui promo yang dipakai apakah akan diaktifkan atau tidak
     */
    public Promo(int id, String code, int discount, int minPrice, boolean active) {
        //Kata kunci this digunakan untuk mereferensikan obyek saat ini yaitu customer
        this.id = id;
        this.code = code;
        this.discount = discount;
        this.minPrice = minPrice;
        this.active = active;
    }

    /**
     * Method getID merupakan method getter untuk variabel id
     * @return <code>int<code> akan mengembalikan nilai id ketika method ini
     * dipanggil
     */
    public int getId()
    {
        return id;
    }

    /**
     * Method getCode merupakan method getter untuk variabel Code
     * @return <code>String<code> akan mengembalikan nilai Code ketika method ini
     * dipanggil
     */
    public String getCode()
    {
        return code;
    }

    /**
     * Method getDiscount merupakan method getter untuk variabel Discount
     * @return <code>String<code> akan mengembalikan nilai Discount ketika method ini
     * dipanggil
     */
    public int getDiscount()
    {
        return discount;
    }

    /**
     * Method getMinPrice merupakan method getter untuk variabel minPrice
     * @return <code>String<code> akan mengembalikan nilai minPrice ketika method ini
     * dipanggil
     */
    public int getMinPrice()
    {
        return minPrice;
    }

    /**
     * Method getActive merupakan method getter untuk variabel Active
     * @return <code>String<code> akan mengembalikan nilai active ketika method ini
     * dipanggil
     */
    public boolean getActive()
    {
        return active;
    }

    /**
     * Method setID merupakan method setter untuk variabel id
     * @param id untuk mengisi data berupa tipe data int ke dalam variabel id
     * @return tidak ada
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * Method setCode merupakan method setter untuk variabel code
     * @param code untuk mengisi data berupa tipe data String ke dalam variabel code
     * @return tidak ada
     */
    public void setCode (String code)
    {
        this.code = code;
    }

    /**
     * Method setDiscount merupakan method setter untuk variabel discount
     * @param discount untuk mengisi data berupa tipe data int ke dalam variabel discount
     * @return tidak ada
     */
    public void setDiscount (int discount)
    {
        this.discount = discount;
    }

    /**
     * Method setMinPrice merupakan method setter untuk variabel minPrice
     * @param minPrice untuk mengisi data berupa tipe data int ke dalam variabel minPrice
     * @return tidak ada
     */
    public void setMinPrice (int minPrice)
    {
        this.minPrice = minPrice;
    }

    /**
     * Method setActive merupakan method setter untuk variabel active
     * @param active untuk mengisi data berupa tipe data boolean ke dalam variabel active
     * @return tidak ada
     */
    public void setActive (boolean active)
    {
        this.active = active;
    }

    public String toString(){
        return "Id = " +id+ "\nCode= " +code+ "\nDiscount= " +discount+ "\nMinimal Price= " +minPrice+ "\nActive Status =  " +active;
    }

}
