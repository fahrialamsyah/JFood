
/**
 * Enumeration class FoodCategory - write a description of the enum class here
 *
 * @author Fahri Alamsyah
 * @version 5 Maret 2020
 */
public enum FoodCategory
{
    Beverages("Beverages"),Coffee("Coffee"),Western("Western"),Snacks("Snacks"),Rice("Rice"),Noodles("Noodles"),Bakery("Bakery"),Japanese("Japanese");
    
    private String kategori;
    
    FoodCategory(String kategori)
    {
        this.kategori = kategori;
    }
    
    public String toString()
    {
        return kategori;
    }
    
}
