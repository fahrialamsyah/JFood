package fahrialamsyah.jfood;
import java.util.ArrayList;

/**
 * Write a description of class DatabaseCustomer here.
 *
 * @author Fahri Alamsyah
 * @version 16 - 04 - 2020
 */
public class DatabaseCustomer {
    // instance variables - replace the example below with your own
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<>();
    private static int lastId = 0;

    /**
     * Constructor for objects of class DatabaseCustomer
     */
    public DatabaseCustomer() {
        // initialise instance variables

    }

    /**
     * An example of a method - replace this comment with your own
     */
    public static Customer getCustomerLogin(String email, String password){
        for(Customer customer : CUSTOMER_DATABASE){
            if(customer.getEmail()== email && customer.getPassword()==password){
                return customer;
            }
        }
        return null;

    }


    public static boolean addCustomer(Customer customer) throws EmailAlreadyExistsException{
        boolean sameEmailBuff = false;
        for (Customer buff: CUSTOMER_DATABASE) {
            if (customer.getEmail().equals(buff.getEmail())) {
                sameEmailBuff = true;
                break;
            }
        }

        if (!sameEmailBuff) {
            CUSTOMER_DATABASE.add(customer);
            lastId = customer.getId();
            return true;
        }
        throw new EmailAlreadyExistsException(customer);
    }

    public static boolean removeCustomer(int id) throws CustomerNotFoundException{
        for (Customer customer: CUSTOMER_DATABASE) {
            if (customer.getId() == id){
                CUSTOMER_DATABASE.remove(customer);
                return true;
            }
        }
        throw new CustomerNotFoundException(id);
    }



    public static ArrayList<Customer> getCustomerDatabase() {
        return CUSTOMER_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    public static Customer getCustomerById(int id) throws CustomerNotFoundException{
        for (Customer customer: CUSTOMER_DATABASE) {
            if (customer.getId() == id){
                return customer;
            }
        }
        throw new CustomerNotFoundException(id);

    }

}
