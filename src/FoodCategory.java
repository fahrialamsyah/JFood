
/**
 * Enumeration class FoodCategory - write a description of the enum class here
 *
 * @author Fahri Alamsyah
 * @version 02 - 04 - 2020
 */
public enum FoodCategory
{
    Beverages("Beverages"),
    Coffee("Coffee"),
    Western ("Western"),
    Snacks("Snacks"),
    Rice("Rice"),
    Noodles("Noodles"),
    Bakery("Bakery"),
    Japanese("Japanese");

    private String category;

    FoodCategory(String category){
        this.category = category;
    }

    public String toString() {
        return category;
    }
}
