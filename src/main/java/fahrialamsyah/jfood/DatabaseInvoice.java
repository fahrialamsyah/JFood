package fahrialamsyah.jfood;

import java.util.ArrayList;

/**
 * <h1>Database Invoice<h1>
 * Kelas ini berfungsi untuk menjadi wadah untuk menampung menu makanan ke suatu variable
 * list yaitu InvoiceDatabase
 *
 * @author Fahri Alamsyah
 * @version 27-February-2020
 *
 */
public class DatabaseInvoice
{
    //Atribut yang digunakan pada kelas ini dengan access modifier privaten
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<>();
    private static int lastid = 0;

    /**
     * this method is getter for every invoice in invoice's database
     * @return ArrayList<Invoice> is the array list of every invoice in the invoice's database
     */
    public static ArrayList<Invoice> getInvoiceDatabase()
    {
        return INVOICE_DATABASE;
    }

    /**
     * this method is to get the id of the last invoice added to invoice's database
     * @return an integer of the last invoice's id
     */
    public static int getLastid()
    {
        return lastid;
    }

    /**
     * this method is to get some invoice by specifying it's id
     * @param id is the invoice's id for the expected invoice object this method returns
     * @return an Invoice class object in respect of the id specified in the parameter
     * @throws InvoiceNotFoundException to check whether the invoice that goes by the id in the parameter exist or not
     */
    public static Invoice getInvoiceById(int id) throws InvoiceNotFoundException {
        for(Invoice invoice: INVOICE_DATABASE) {
            if (invoice.getId() == id) {
                return invoice;
            }
        }
        throw new InvoiceNotFoundException(id);

    }
    /**
     * this method is to get every invoice under one customer
     * @param customerId is the customer's id for the expected array list invoice that the customer have
     * @return an ArrayList of Invoice object that the customer have
     * @throws CustomerNotFoundException to check whether the invoice that goes by the customerId in the parameter exist or not
     */
    public static ArrayList<Invoice> getInvoiceByCustomer (int customerId) throws CustomerNotFoundException{
        ArrayList<Invoice> ret = new ArrayList<>();
        for (Invoice invoice: INVOICE_DATABASE) {
            if (invoice.getCustomer().getId() == customerId) {
                ret.add(invoice);
            }else{
                throw new CustomerNotFoundException(customerId);
            }
        }
        return ret;
    }
    /**
     * this method is to change the invoice status for the invoice going by the id specified in the id parameter
     * @param id is the id of the invoice that wanted to be changed the status of
     * @param invoiceStatus is the status enum that wanted to be assigned to the invoice
     * @return a boolean, true if the invoice's status is successfully changed
     */
    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus)
    {
        for(Invoice invoice : INVOICE_DATABASE) {
            if(invoice.getId() == id && invoice.getStatus().equals(InvoiceStatus.Ongoing)){
                invoice.setInvoiceStatus(invoiceStatus);
                return true;
            }
        }
        return false;
    }

    /**
     * this method is to add invoice to the array list in the DatabaseInvoice that hold every invoice registered
     * @param invoice is a Invoice class object that wanted to be added to the DatabaseInvoice class array list
     * @return a boolean, true if the invoice is successfully added
     */

    public static boolean addInvoice(Invoice invoice) throws OngoingInvoiceAlreadyExistsException
    {
        int customerId = invoice.getCustomer().getId();
        for (Invoice invoice1 : INVOICE_DATABASE){
            if(invoice1.getCustomer().getId() == customerId && invoice1.getStatus() == InvoiceStatus.Ongoing){
                throw new OngoingInvoiceAlreadyExistsException(invoice);
            }
        }
        INVOICE_DATABASE.add(invoice);
        lastid = invoice.getId();
        return true;
    }
    /**
     * this method is to remove an invoice going by the id specified in the id parameter
     * @param id is the id of the invoice that wanted to removed
     * @return a boolean, true if the invoice's status is successfully removed
     */
    public static boolean removeInvoice (int id) throws InvoiceNotFoundException{
        for(Invoice invoice : INVOICE_DATABASE) {
            if (invoice.getId() == id) {
                INVOICE_DATABASE.remove(invoice);
                return true;
            }
        }
        throw new InvoiceNotFoundException(id);
    }

}