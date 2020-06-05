package fahrialamsyah.jfood;

/**
 * <h1>Seller<h1>
 * Kelas ini berfungsi untuk mendapatkan dan memberikan nilai pada obyek seller
 * dengan memanfaatkan method constructor, mutator, dan accessor
 *
 * @author Fahri Alamsyah
 * @version 27-February-2020
 *
 */
public class Seller
{
    //Atribut yang digunakan pada kelas ini dengan access modifier private
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;

    /**
     * Sebuah constructor pada kelas awal yang akan memberikan nilai ketika
     * method ini dipanggil dengan menginisiasikan nilai awal sesuai dengan
     * parameternya
     *
     * @param id memberi nilai berupa id dengan tipe data int
     * @param name memberi nilai berupa nama dengan tipe data string
     * @param email memberi nilai berupa alamat email dengan tipe data string
     * @param phoneNumber memberi nilai berupa nomor telepon dengan tipe data string
     * @param location memasukkan obyek location
     */
    public Seller(int id, String name, String email, String phoneNumber, Location location)
    {
        //Kata kunci this digunakan untuk mereferensikan obyek saat ini yaitu Seller
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }
    /**
     * Method getID merupakan method getter untuk variabel id
     * @return <code>int<code> akan mengembalikan nilai id ketika method ini
     * dipanggil
     */
    public int getId() {
        return id;
    }

    /**
     * Method getName merupakan method getter untuk variabel Name
     * @return <code>String<code> akan mengembalikan nilai Name ketika method ini
     * dipanggil
     */
    public String getName() {
        return name;
    }

    /**
     * Method getEmail merupakan method getter untuk variabel email
     * @return <code>String<code> akan mengembalikan nilai email ketika method ini
     * dipanggil
     */
    public String getEmail (){
        return email;
    }

    /**
     * Method getPhoneNumber merupakan method getter untuk variabel phoneNumber
     * @return <code>String<code> akan mengembalikan nilai phoneNumber ketika method ini
     * dipanggil
     */
    public String getPhoneNumber(){
        return phoneNumber;
    }

    /**
     * Method getLocation merupakan method getter untuk obyek location
     * @return <code>Seller<code> akan mengembalikan nilai location ketika method ini
     * dipanggil
     */
    public Location getLocation(){
        return location;
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
    public void setName (String name) {
        this.name = name;
    }

    /**
     * Method setEmail merupakan method setter untuk variabel email
     * @param email untuk mengisi data berupa tipe data String ke dalam variabel email
     * @return tidak ada
     */
    public void setEmail (String email) {
        this.email = email;
    }

    /**
     * Method setPhoneNumber merupakan method setter untuk variabel phoneNumber
     * @param phoneNumber untuk mengisi data berupa tipe data String ke dalam variabel phoneNumber
     * @return tidak ada
     */
    public void setPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Method setLocation merupakan method setter untuk obyek location
     * @param location untuk mengisi data berupa tipe data Location ke dalam obyek location
     * @return tidak ada
     */
    public void setLocation (Location location) {
        this.location = location;
    }

    /**
     * Method ini digunakan untuk mencetak data berupa nama
     */
    public void printData(){
        System.out.println("Name :" +name);
    }

    public String toString(){
        return "Id = " +id+ "\nNama= " +name+ "\nPhone Number= " +phoneNumber+ "\nLocation= " +location;
    }


}

