
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String password;
    private String joinDate;

    /**
     * Constructor for objects of class Customer
     */
    public Customer(int id, String name, String email, String password, String joinDate)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
        // initialise instance variable
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
    
    public String getPassword()
    {
        
       return password; 
        
    }
    
    public String getJoinDate()
    {
        return joinDate;
    }
    
    public int setId(int id)
    {
        return id;
    }
    
    public String setName(String name)
    {
        return name;
    }
    
    public String setEmail(String email)
    {
        return email;
    }
    
    public String setPassword(String password)
    {
        return password;
    }
   
    public String setJoinDate(String joindate)
    {
        return joinDate;
    }
   
    public void printData()
    {
        System.out.println(getName());
    }
}
