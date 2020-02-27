
/**
 * Write a description of class Location here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
    public Location(String province, String description, String city)
    {
        // initialise instance variables
        this.city = this.city;
        this.province = this.province;
        this.description = this.description;
    }
    
    public String getProvince()
    {
        return province;
    }
    
    public String getCity()
    {
        return city;
    }
    
    public String getdescription()
    {
        return description;
    }
    
    public void setProvince(String province)
    {
        this.province = this.province;
    }
    
    public void setCity(String city)
    {
        this.city = this.city;
    }
    
    public void setDescription(String description)
    {
        this.description = this.description;
    }
    
    public void printData()
    {
        System.out.println(getProvince());
    }
    
  
}
