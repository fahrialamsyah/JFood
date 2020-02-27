
/**
 * Write a description of class Seller here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
    public Seller(int id, String name, String email, String phonenumber, Location location)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;  
        // initialise instance variables
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    public void getLocation()
    {
        
    }
    
    
    public void setId(int id)
    {
       this.id = id;
    }
    
      public void setName(String name)
    {
       this.name = name ;
    }
    
      public void setEmail(String email)
    {
       this.email = email; 
    }
    
      public void setPhoneNumber(String phonenumber)
    {
        this.phoneNumber = phoneNumber;
    }
    
      public void setLocation(Location location)
    {
       this.location = location;
    }
    
      public void printData()
    {
        System.out.println(getName());
    }
          
}
