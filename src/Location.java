/**
 * Write a description of class Food here.
 *
 * @author Fahri Alamsyah
 * @version 09 - 04 -2020
 */
public class Location
{
    // instance variables - replace the example below with your own
    private String province;
    private String description;
    private String city;

    /**
     * Constructor for objects of class Location
     */
    public Location(String city, String province, String description)
    {
        // initialise instance variables
        this.city = city;
        this.province = province;
        this.description = description;
    }


    /**
     * @return String
     */
    public String getProvince() {
        return this.province;
    }


    /**
     * @return String
     */
    public String getCity() {
        return this.city;
    }


    /**
     * @return String
     */
    public String getDescription() {
        return this.description;
    }


    /**
     * @param city
     */
    public void setCity(String city){
        this.city = city;
    }


    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }



    /**
     * @param province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * Print the data inside this object
     */
    public String toString(){

        return "\n"+
                "Province: " + province + "\n"+
                "City: " + city + "\n" +
                "Description: " + description + "\n";
    }



}
