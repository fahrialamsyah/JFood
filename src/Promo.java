
/**
 * Write a description of class Promo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Promo
{
    // instance variables - replace the example below with your own
    private int id;
    private String code;
    private int discount;
    private int minPrice;
    private boolean active;

    /**
     * Constructor for objects of class Promo
     */
    public Promo(int id,String code, int discount,int minPrice, boolean active)
    {
        // initialise instance variables
        this.id = id;
        this.code = code;
        this.discount = discount;
        this.minPrice = minPrice;
        this.active = active;
    }

    /**
     * Getter id for Promo
     * @return id untuk mengecek variabel id ke variabel instance
     */
    public int getId()
    {
      return id;   
    }
    
    /**
     * Getter Code for Promo
     * @return idFood untuk mengecek variabel idFood ke variabel instance
     */
    public String getCode()
    {
      return code;
    }
    
    /**
     * Getter Discount for Promo
     * @return Discount untuk mengecek variabel Date ke variabel instance
     */
    public int getDiscount()
    {
       return discount;
    }
    
    /**
     * Getter TotalPrice for invoice
     * @return totalPrice untuk mengecek variabel TotalPrice ke Variabel instance
     */
      public int getMinPrice()
    {
       return minPrice;
    }
    
    /**
     * Getter Customer for invoice
     * @return customer untuk mengecek variabel customer ke variabel instance
     */
      public boolean getActive()
    {
      return active;
    }
    
    /**
     * Setter id for invoice
     * @param id untuk set ke instance variabel id
     */
    public void setId(int id)
    {
      this.id = id;
    }
    
    /**
     * Setter idFood for invoice
     * @param idFood untuk set ke instance variabel idFood
     */
    public void setCode(String code)
    {
        this.code = code;
    }
    
    /**
     * Setter Date for Invoice
     * @param Date untuk set ke instance variabel Date 
     */
    public void setDiscount(int discount)
    {
        this.discount = discount;
    }
    
    /**
     * Setter TotalPrice for Invoice
     * @param TotalPrice untuk set ke instance variabel TotalPrice
     */
    public void setMinPrice(int minPrice)
    {
        this.minPrice = minPrice;
    }
    
    /**
     * Setter Customer for Invoice
     * @param customer untuk set ke instance variabel customer
     */
    public boolean setActive(boolean active)
    {
        return active;
    }
    
    /**
     * Print Data (Post Test No 2)
     */
    public void printData()
    {
        System.out.println("=========Promo==========");
        
    }
    
    public String toString()
    {
        return "=========Food========\n" +
        "Id : " + getId() + "\n" +
        "Code : " + getCode() + "\n"+
        "Discount : " + getDiscount() + "\n"+
        "MinPrice: "  +  getMinPrice() + "\n"+
        "ActiveStatus : " +  getActive() + "\n"+"\n"; 
    }
    
}
