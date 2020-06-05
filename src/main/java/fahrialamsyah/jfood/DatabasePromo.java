package fahrialamsyah.jfood;

/**
 * <h1>Database Promo<h1>
 * Kelas ini berfungsi untuk menjadi wadah untuk menampung Promo makanan ke suatu variable
 * list yaitu listPromo
 *
 * @author Fahri Alamsyah
 * @version 27-February-2020
 *
 */
import java.util.ArrayList;
public class DatabasePromo
{
    //Atribut yang digunakan pada kelas ini dengan access modifier private

    private static ArrayList<Promo> PROMO_DATABASE = new ArrayList<>();
    private static int lastId = 0;

    /**
     * this method is to activate the promo by specifying it's id
     * @param id is the id of the promo that wanted to be activated
     * @return a boolean, true if the invoice is successfully activated
     */
    public static boolean activatePromo(int id) {
        Promo promo = PROMO_DATABASE.get(id);
        if (promo != null) {
            promo.setActive(true);
            return true;
        }
        return false;
    }

    /**
     * this method is to deactivate the promo by specifying it's id
     * @param id is the id of the promo that wanted to be deactivated
     * @return a boolean, true if the invoice is successfully deactivated
     */
    public static boolean deactivatePromo(int id) {
        Promo promo = PROMO_DATABASE.get(id);
        if (promo != null) {
            promo.setActive(false);
            return true;
        }
        return false;
    }
    /**
     * this method is to get some promo by specifying it's code
     * @param code is the promo's code for the expected promo object this method returns
     * @return a Promo class object in respect of it's code specified in the parameter
     */
    public static Promo getPromoByCode(String code) {
        for (Promo promo: PROMO_DATABASE) {
            if (promo.getCode().equals(code)) {
                return promo;
            }
        }
        return null;
    }

    /**
     * this method is to get some promo by specifying it's id
     * @param id is the promo's id for the expected promo object this method returns
     * @return a Promo class object in respect of the id specified in the parameter
     * @throws PromoNotFoundException to check whether the promo that goes by the id in the parameter exist or not
     */
    public static Promo getPromoById(int id) throws PromoNotFoundException{
        for (Promo promo: PROMO_DATABASE) {
            if (promo.getId() == id) {
                return promo;
            }
        }
        throw new PromoNotFoundException(id);
    }
    /**
     * this method is getter for every promo in promo's database
     * @return ArrayList<Promo> is the array list of every promo in the promo's database
     */
    public static ArrayList<Promo> getPromoDatabase()
    {
        return PROMO_DATABASE;
    }

    /**
     * this method is to get the id of the last promo added to promo's database
     * @return an integer of the last promo's id
     */
    public static int getLastId()
    {
        return lastId;
    }


    /**
     * Method ini berfungsi untuk menambahkan Promo ke dalam listPromo
     * @param promo obyek promo akan dimasukkan ke dalam list listPromo
     * @return true, apabila obyek berhasil ditambahkan maka akan mengembalikan nilai true
     */
    public static boolean addPromo(Promo promo) throws PromoCodeAlreadyExistsException
    {
        boolean samePromoCode = false;
        for (Promo buff: PROMO_DATABASE) {
            if (promo.getCode().equals(buff.getCode())) {
                throw new PromoCodeAlreadyExistsException(promo);
            }

        }

        if (!samePromoCode) {
            PROMO_DATABASE.add(promo);
            lastId = PROMO_DATABASE.indexOf(promo);
        }
        return false;
    }

    /**
     * this method is to remove a promo going by the id specified in the id parameter
     * @param id is the id of the promo that wanted to be removed
     * @return a boolean, true if the promo is successfully removed
     */
    public static boolean removePromo(int id) throws PromoNotFoundException
    {
        for(Promo promo : PROMO_DATABASE) {
            if(promo.getId() == id) {
                PROMO_DATABASE.remove(promo);
                return true;
            }
        }
        throw new PromoNotFoundException(id);
    }

    public static Promo getPromo()
    {
        return null;
    }

}
