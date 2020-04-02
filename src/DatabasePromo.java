import java.util.ArrayList;

/**
 * Ini adalah kelas database promo
 *
 * @author Fahri Alamsyah
 * @version 02 - 04 - 2020
 */
public class DatabasePromo
{
    // instance variables - replace the example below with your own
    private static ArrayList<Promo> PROMO_DATABASE = new ArrayList<>();
    private static int lastId = 0;

    /**
     * Constructor for objects of class DatabasePromo
     */
    public DatabasePromo()
    {
        // initialise instance variables

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @return    the sum of x and y
     */
    public static boolean addPromo(Promo promo) {

        boolean samePromoCode = false;
        for (Promo buff: PROMO_DATABASE) {
            if (promo.getCode() == buff.getCode()) {
                samePromoCode = true;
            }
        }

        if (!samePromoCode) {
            PROMO_DATABASE.add(promo);
            lastId = PROMO_DATABASE.indexOf(promo);
        }
        return false;
    }

    public boolean removePromo (int id) {
        Promo promo = PROMO_DATABASE.get(id);
        if (promo != null) {
            PROMO_DATABASE.remove(promo);
            return true;
        }
        return false;
    }

    public static boolean activatePromo(int id) {
        Promo promo = PROMO_DATABASE.get(id);
        if (promo != null) {
            promo.setActive(true);
            return true;
        }
        return false;
    }

    public static boolean deactivatePromo(int id) {
        Promo promo = PROMO_DATABASE.get(id);
        if (promo != null) {
            promo.setActive(false);
            return true;
        }
        return false;
    }

    public static Promo getPromoByCode(String code) {
        for (Promo promo: PROMO_DATABASE) {
            if (promo.getCode().equals(code)) {
                return promo;
            }
        }
        return null;
    }

    public static Promo getPromoById(int id) {
        Promo promo = PROMO_DATABASE.get(id);
        if (promo != null) {
            return promo;
        }
        return null;
    }

    public static ArrayList<Promo> getPromoDatabase() {
        return PROMO_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }
}
