package fahrialamsyah.jfood;
/**
 * <h1>Location<h1>
 * Kelas ini berfungsi untuk mendapatkan dan memberikan nilai pada obyek Location
 * dengan memanfaatkan method constructor, mutator, dan accessor
 *
 * @author Fahri Alamsyah
 * @version 27-February-2020
 *
 */

public class Location
{
    //Atribut yang digunakan pada kelas ini dengan access modifier private
    private String province;
    private String description;
    private String city;

    /**
     * Sebuah constructor pada kelas awal yang akan memberikan nilai ketika
     * method ini dipanggil dengan menginisiasikan nilai awal sesuai dengan
     * parameternya
     *
     * @param province memberi nilai berupa nama provinsi dengan tipe data string
     * @param description memberi nilai berupa deskripsi dengan tipe data string
     * @param city memberi nilai berupa nama kota dengan tipe data string
     */
    public Location(String province, String description, String city)
    {
        //Kata kunci this digunakan untuk mereferensikan obyek saat ini yaitu location
        this.province = province;
        this.description = description;
        this.city = city;
    }

    /**
     * Method getProvince merupakan method getter untuk variabel province
     * @return <code>String<code> akan mengembalikan nilai province ketika method ini
     * dipanggil
     */
    public String getProvince()
    {
        return province;
    }

    /**
     * Method getDescription merupakan method getter untuk variabel description
     * @return <code>String<code> akan mengembalikan nilai description ketika method ini
     * dipanggil
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Method getCity merupakan method getter untuk variabel Name
     * @return <code>String<code> akan mengembalikan nilai Name ketika method ini
     * dipanggil
     */
    public String getCity()
    {
        return city;
    }

    /**
     * Method setProvince merupakan method setter untuk variabel province
     * @param province untuk mengisi data berupa tipe data String ke dalam variabel province
     * @return tidak ada
     */
    public void setProvince(String province){
        this.province = province;
    }

    /**
     * Method setDescription merupakan method setter untuk variabel description
     * @param description untuk mengisi data berupa tipe data String ke dalam variabel description
     * @return tidak ada
     */
    public void setDescription(String description){
        this.description = description;
    }

    /**
     * Method setCity merupakan method setter untuk variabel city
     * @param city untuk mengisi data berupa tipe data String ke dalam variabel city
     * @return tidak ada
     */
    public void setCity(String city)
    {
        this.city = city;
    }

    public String toString(){
        return "Province= " +province+ "\nCity= " +city+ "\nDescription= " +description;
    }
}

