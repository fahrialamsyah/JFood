package fahrialamsyah.jfood;

import java.util.ArrayList;

/**
 * <h1>Database Seller<h1>
 * Kelas ini berfungsi untuk menjadi wadah untuk menampung Seller ke suatu variable
 *
 * @author Fahri Alamsyah
 * @version 27-February-2020
 */
public class DatabaseSeller
{
    //Atribut yang digunakan pada kelas ini dengan access modifier privaten
    private static ArrayList<Seller> SELLER_DATABASE = new ArrayList<Seller>();
    private static int lastid = 0;

    /**
     * this method is getter for every Seller in Seller's database
     * @return ArrayList<Seller> is the array list of every seller in the seller's database
     */
    public static ArrayList<Seller> getSellerDatabase()
    {
        return SELLER_DATABASE;
    }

    /**
     * this method is to get the id of the last promo added to promo's database
     * @return an integer of the last promo's id
     */
    public static int getLastId()
    {
        return lastid;
    }
    /**
     * this method is to get some promo by specifying it's id
     * @param id is the seller's id for the expected seller object this method returns
     * @return a Seller class object in respect of the id specified in the parameter
     * @throws SellerNotFoundException to check whether the Seller that goes by the id in the parameter exist or not
     */
    public static Seller getSellerById(int id) throws SellerNotFoundException{
        for(Seller seller : SELLER_DATABASE) {
            if (seller.getId() == id) {
                return seller;
            }
        }
        throw new SellerNotFoundException(id);
    }


    /**
     * Method ini berfungsi untuk menambahkan Seller ke dalam listSeller
     * @param seller obyek seller akan dimasukkan ke dalam list listSeller
     * @return true, apabila obyek berhasil ditambahkan maka akan mengembalikan nilai true
     */
    public static boolean addSeller(Seller seller)
    {
        SELLER_DATABASE.add(seller);
        lastid = seller.getId();
        return true;
    }

    /**
     * Method ini berfungsi untuk menghapus penjual dari listSeller
     * @param id obyek seller akan dikeluarkan dari list listSeller
     * @return true, apabila obyek berhasil dikeluarkan maka akan mengembalikan nilai true
     */
    public static boolean removeSeller (int id) throws SellerNotFoundException {
        Seller seller = SELLER_DATABASE.get(id);
        if (seller != null) {
            SELLER_DATABASE.remove(seller);
            return true;
        }
        throw new SellerNotFoundException(id);

    }

    /**
     * Method getListSeller merupakan method getter untuk variabel listSeller
     * @return <code>String[]<code> akan mengembalikan nilai listFood ketika method ini
     * dipanggil
     */

}

