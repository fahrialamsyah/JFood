package fahrialamsyah.jfood;
/**
 * Enumeration class FoodCategory - write a description of the enum class here
 *
 * @author Fahri Alamsyah
 * @version 16-04-2020
 */
public enum FoodCategory
{
    Beverages("Beverages"),
    Coffee("Coffee"),
    Western("Western"),
    Snacks("Snacks"),
    Rice("Rice"),
    Noodles("Noodles"),
    Bakery("Bakery"),
    Japanese("Japanese");


    private String foodCategory;

    FoodCategory (String foodCategory)
    {
        this.foodCategory = foodCategory;
    }

    public String toString() {
        return foodCategory;
    }

}
