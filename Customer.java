/**
* Program Customer merupakan kelas yang mengimplementasikan data pembeli makanan
* 
* @author Fahri Alamsyah
* @version 19-03-2020
*/
import java.util.*;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Customer
{
    // Variabel yang terdapat pada Class Customer
    private int id;
    private String name;
    private String email;
    private String password;
    private Calendar joinDate;
    private Pattern pattern;
    private Matcher mathcer;
    
    
    /**
      * Method ini berfungsi untuk memanggil data pada Class Customer.
      * Method ini mengumpulkan dan memanggil data yang telah dibuat pada method lain.
      * 
      * @param id merupakan parameter yang menunjukkan id Customer.
      * @param name merupakan parameter untuk nama Customer.
      * @param email merupakan parameter untuk email customer.
      * @param password merupakan parameter untuk password email customer.
      * @param joinDate merupakan parameter untuk menunjukkan pada tanggal berapa Customer bergabung.
      * @return Tidak ada.
      */
    public Customer(int id, String name, String email, String password, Calendar joinDate)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
        setPassword(password);
        setEmail(email);
    }
    
     /**
      * Method ini berfungsi untuk memanggil data pada Class Customer.
      * Method ini mengumpulkan dan memanggil data yang telah dibuat pada method lain.
      * 
      * @param id merupakan parameter yang menunjukkan id Customer.
      * @param name merupakan parameter untuk nama Customer.
      * @param email merupakan parameter untuk email customer.
      * @param password merupakan parameter untuk password email customer.
      * @param joinDate merupakan parameter untuk menunjukkan pada tanggal berapa Customer bergabung.
      * @return Tidak ada.
      */
    public Customer(int id, String name, String email, String password, int year, int month, int dayOfMonth)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = new GregorianCalendar(year, month, dayOfMonth);
        setPassword(password);
        setEmail(email);
    }
    
     /**
      * Method ini berfungsi untuk memanggil data pada Class Customer.
      * Method ini mengumpulkan dan memanggil data yang telah dibuat pada method lain.
      * 
      * @param id merupakan parameter yang menunjukkan id Customer.
      * @param name merupakan parameter untuk nama Customer.
      * @param email merupakan parameter untuk email customer.
      * @param password merupakan parameter untuk password email customer.
      * @param joinDate merupakan parameter untuk menunjukkan pada tanggal berapa Customer bergabung.
      * @return Tidak ada.
      */
    public Customer(int id, String name, String email, String password)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        setPassword(password);
        setEmail(email);
    }
    
    /**
     * Method untuk mengambil id pada Class Customer
     * @return merepresentasikan data id pada Class Customer
     */
    public int getId() 
    {
        return id;
    }
    
    /**
     * Method untuk mengambil data Name pada Class Customer.
     * @return merepresentasikan data name pada Class Customer.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Method untuk mengambil Email pada Class Customer.
     * @return merepresentasikan data email pada Class Customer.
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * Method untuk mengambil data Password pada Class Customer.
     * @return merepresentasikan data Password pada Class Customer.
     */
    public String getPassword()
    {
        return password;
    }
    
    /**
     * Method untuk mengambil data joinDate pada Class Customer.
     * @return merepresentasikan data joinDate pada Class Customer.
     */
    public Calendar getJoinDate()
    {
        return joinDate;
    }
    
   
    /**
     * Method untuk membuat id Customer pada Class Customer.
     * @param id mengandung informasi tentang id makanan pada Class Customer.
     */
    public void setId(int id)
    {
        this.id = id;
    }
    
    /**
     * Method untuk membuat Nama Customer pada Class Customer.
     * @param id mengandung informasi tentang nama Customer pada Class Customer.
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * Method untuk membuat Email Customer pada Class Customer.
     * @param id mengandung informasi tentang email customer pada Class Customer.
     * Pembuatan kondisi if dan else untuk regex Email
     */
    public void setEmail(String email)
    {
        String pattern =  "^[a-zA-Z0-9_+&*-]+(?:\\."+  
                            "[a-zA-Z0-9_+&*-]+)*@" +  
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +  
                            "A-Z]{2,7}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(email);
        if (m.find()) {
            System.out.println("Email : " + m.group());
            this.email = email;
        } else {
            System.out.println("Email : null");
            this.email = email;
        }
            
    }
    
    /**
     * Method untuk membuat password dari email Customer pada Class Customer.
     * @param id mengandung informasi tentang password email customer pada Class Customer.
     * Pembuatan kondisi if dan else untuk regex Email
     */
    public void setPassword(String password)
    {
        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(password);
        if(m.find()){
            System.out.println("Password: " + m.group());
            this.password = password;
        }else{
            System.out.println("Password: NULL");
            this.password = "NULL";
        }
    }
    
    /**
     * Method untuk membuat tanggal bergabungnya Customer pada Class Customer.
     * @param joinDate mengandung informasi tentang Tanggal bergabungnya Customer pada Class Customer.
     */
    public void setJoinDate(Calendar joinDate)
    {
        this.joinDate = joinDate;
    }
    
     /**
     * Method untuk membuat tanggal bergabungnya Customer pada Class Customer.
     * @param joinDate mengandung informasi tentang Tanggal bergabungnya Customer pada Class Customer.
     */
    public void setJoinDate(int year, int month, int dayOfMonth)
    {
        this.joinDate = new GregorianCalendar(year, month-1, dayOfMonth);
    }
    
    public String toString(){
        return "=========Customer========\n" +
        "Id : " + getId() + "\n" +
        "Nama : " + getName() + "\n"+
        "Email : " + getEmail() + "\n"+
        "Password : " + getPassword() + "\n"+
        "JoinDate : " + getJoinDate() + "\n";
    }
    
   
}