package fahrialamsyah.jfood;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.text.SimpleDateFormat;

/**
 * Write a description of class Food here.
 *
 * @author Fahri Alamsyah
 * @version 17 - 04 - 2020
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String password;
    private Calendar joinDate;

    /**
     * Constructor for objects of class Customer
     */
    public Customer(int id, String name, String email, String password, Calendar joinDate)
    {
        // initialise instance variables
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        this.joinDate = joinDate;
    }

    public Customer(int id, String name, String email, String password, int year, int month,
                    int dayOfMonth)
    {
        // initialise instance variables
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        this.joinDate = new GregorianCalendar(year, month, dayOfMonth);

    }

    public Customer(int id, String name, String email, String password)
    {
        // initialise instance variables
        Calendar calendar = Calendar.getInstance();
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        this.joinDate = new GregorianCalendar(calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH));
    }

    /**
     * Get the id of the customer
     *
     * @return id   the id of the customer
     */
    public int getId() {

        return this.id;
    }

    /**
     * <h1> Get the name of the customer<h1>
     *
     * @return name Returning the name of the customer as String
     */
    public String getName(){

        return this.name;
    }

    /**
     * <h1>Get the email of the customer</h1>
     *
     * @return email as String
     */
    public String getEmail(){

        return this.email;
    }

    /**
     * <h1>Get the recorded of the customer account</h1>
     *
     * @return password as String
     */
    public String getPassword(){

        return this.password;
    }

    /**
     * <h1>Get the recorded date of the customer joined</h1>
     *
     * @return joinDate as String
     */
    public Calendar getJoinDate(){

        return this.joinDate;
    }

    /**
     * <h1>Set the id of the customer by passing the id of the customer as integer</h1>
     * @param id as integer
     */
    public void setId(int id){
        this.id = id;
    }

    /**
     * <h1> Set the name of the customer by passing the name as string to this method</h1>
     * <p>
     * @param name the name of the customer
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * <h1>Set the email of the customer</h1>
     * @param email the email of the customer
     */
    public void setEmail(String email) {
        String checkPattern = "^([\\w\\&\\*_~]+\\.{0,1})+@[\\w][\\w\\-]*(\\.[\\w\\-]+)+$";

        Pattern pattern = Pattern.compile(checkPattern);
        Matcher matcher = pattern.matcher(email);
        if (matcher.find()) {
            this.email = email;
        } else {
            System.out.println("Invalid Email Address\n");
            this.email = "";
        }
    }

    /**
     * <h1>Set the password of the customer account</h1>
     * <p>
     * @param password the password of the customer account as String/Text
     */
    public void setPassword(String password) {
        String checkPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";

        Pattern pattern = Pattern.compile(checkPattern);
        Matcher matcher = pattern.matcher(password);

        if (matcher.find()) {
            this.password = password;
        } else {
            System.out.println("Invalid Password\n");
            this.password = "";
        }
    }

    /**
     * <h1>
     * Set the date of the customer joined
     * </h1>
     * <p>
     * @param joinDate Date  as String
     *
     */
    public void setJoinDate(Calendar joinDate) {
        this.joinDate = joinDate;
    }

    public void setJoinDate(int year, int month, int dayOfMonth) {
        this.joinDate = new GregorianCalendar(year, month, dayOfMonth);
    }

    public String toString(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        if (joinDate != null) {
            return "Id: " + id + "\n" +
                    "Nama: " + name + "\n" +
                    "Email: " + email + "\n" +
                    "Password: " + password + "\n" +
                    "Join Date: " + formatter.format(joinDate.getTime()) + "\n";
        } else {
            return "Id: " + id + "\n" +
                    "Nama: " + name + "\n" +
                    "Email: " + email + "\n" +
                    "Password: " + password + "\n" ;
        }
    }
}
