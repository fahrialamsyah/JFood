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

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer
{
    //Atribut yang digunakan pada kelas ini dengan access modifier private
    private int id;
    private String name;
    private String email;
    private String password;
    private Calendar joinDate;

    /**
     * Constructor for objects of class Customer
     * @param id is to hold value of object's id
     * @param email is to hold value of object's email
     * @param password is to hold value of object's password
     * @param joinDate is to hold value of object's joinDate
     */
    public Customer(int id, String name, String email, String password, Calendar joinDate) {
        //Kata kunci this digunakan untuk mereferensikan obyek saat ini yaitu customer
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
        setEmail(email);
        setPassword(password);

    }

    public Customer(int id, String name, String email, String password, int year, int month, int dayOfMonth) {
        //Kata kunci this digunakan untuk mereferensikan obyek saat ini yaitu customer
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = new GregorianCalendar(year,month - 1,dayOfMonth);
        setEmail(email);
        setPassword(password);
    }

    public Customer(int id, String name, String email, String password) {
        //Kata kunci this digunakan untuk mereferensikan obyek saat ini yaitu customer
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        setEmail(email);
        setPassword(password);
        this.joinDate = Calendar.getInstance();
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
    public String getEmail() {
        return email;
    }

    /**
     * Method getPassword merupakan method getter untuk variabel password
     * @return <code>String<code> akan mengembalikan nilai password ketika method ini
     * dipanggil
     */
    public String getPassword() {
        return password;
    }

    /**
     * Method getJoinDate merupakan method getter untuk variabel joinDate
     * @return <code>String<code> akan mengembalikan nilai password ketika method ini
     * dipanggil
     */
    public Calendar getJoinDate() {
        return joinDate;
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
        String pattern =  "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(email);
        if (m.find()) {
            this.email = email;
        } else {
            this.email = "";
        }
    }

    /**
     * Method setPassword merupakan method setter untuk variabel password
     * @param password untuk mengisi data berupa tipe data String ke dalam variabel email
     * @return tidak ada
     */
    public void setPassword (String password) {

        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(password);
        if (m.find()) {
            this.password = password;
        } else {
            this.password = "";

        }

    }

    /**
     * Method setJoinDate merupakan method setter untuk variabel joinDate
     * @param joinDate untuk mengisi data berupa tipe data String ke dalam variabel joinDate
     * @return tidak ada
     */
    public void setJoinDate (Calendar joinDate) {
        this.joinDate = joinDate;
    }

    public void setJoinDate(int year, int month, int dayOfMonth) {
        this.joinDate = new GregorianCalendar(year,month-1,dayOfMonth);
    }

    /**
     * Method ini digunakan untuk mencetak variable name
     */
    public String toString()
    {
        String string = "";
        if(joinDate!=null)
        {
            Date date = joinDate.getTime();
            SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
            String date1 = format1.format(date);
            string = "Customer:\n"+
                    "ID = "+id+"\n"+
                    "Nama = "+name+"\n"+
                    "Email = "+email+"\n"+
                    "Password = "+password+"\n"+
                    "Join Date = "+date1+"\n";
        }
        else
        {
            string = "Customer:\n"+
                    "ID = "+id+"\n"+
                    "Nama = "+name+"\n"+
                    "Email = "+email+"\n"+
                    "Password = "+password+"\n";
        }
        System.out.println(string);
        return string;
    }


}
