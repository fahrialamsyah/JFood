package fahrialamsyah.jfood;
/**
 * Write a description of class Food here.
 *
 * @author Fahri Alamsyah
 * @version 13-04-2020
 */
public class Seller
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;
    /**
     * Constructor for objects of class Seller
     */
    public Seller(int id, String name, String email, String phoneNumber, Location location)
    {
        // initialise instance variables
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }


    /**
     * @return Location
     */
    // Get the location of the seller
    public Location getLocation(){
        return this.location;
    }


    /**
     * @return int
     */
    // Get the id of the seller
    public int getId(){
        return this.id;
    }


    /**
     * @return String
     */
    // Get the name of the seller
    public String getName(){
        return this.name;
    }


    /**
     * @return String
     */
    // Get the email of the seller
    public String getEmail(){
        return this.email;
    }


    /**
     * @return String
     */
    // Get the phone number of the seller
    public String getPhoneNumber(){
        return this.phoneNumber;
    }


    /**
     * @param id
     */
    // Set the id of the seller
    public void setId(int id){
        this.id = id;
    }


    /**
     * @param name
     */
    // Set the name of the seller
    public void setName(String name){
        this.name = name;
    }


    /**
     * @param email
     */
    // Set the email of the seller
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * @param phoneNumber
     */
    // Set the phone number of the seller
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * @param location
     */
    // Set the location
    public void setLocation(Location location) {
        this.location = location;
    }

    // Print Data
    public String toString(){

        return "Id: " + id + "\n" +
                "Nama: " + name + "\n" +
                "PhoneNumber: " + phoneNumber + "\n" +
                "Location: " + location.getCity() + "\n";
    }

}
