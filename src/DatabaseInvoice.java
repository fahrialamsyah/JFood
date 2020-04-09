import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Write a description of class DatabaseInvoice here.
 *
 * @author Fahri Alamsyah
 *  @version 08-04-2020
 */

public class DatabaseInvoice
{
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int lastid = 0;


    public static ArrayList<Invoice> getInvoiceDatabase()
    {
        return INVOICE_DATABASE;
    }


    public static int getLastId()
    {
        return lastid;
    }

    public static Invoice getInvoiceById(int id)
    {
        for(Invoice invoice : INVOICE_DATABASE)
        {
            if(id == invoice.getId())
            {
                return invoice;
            }
        }
        return null;
    }


    public static ArrayList<Invoice> getInvoiceByCustomer(int customerId)
    {
        ArrayList<Invoice> invoiceList = new ArrayList<Invoice>();
        Customer customer = DatabaseCustomer.getCustomerById(customerId);

        for(Invoice invoice : INVOICE_DATABASE)
        {
            if(customer.equals(invoice.getCustomer()))
            {
                invoiceList.add(invoice);
            }
        }
        return invoiceList;
    }

    public static boolean addInvoice(Invoice invoice)
    {
        int customerId = invoice.getCustomer().getId();
        for (Invoice invoiceLagi : INVOICE_DATABASE)
        {
            if (invoiceLagi.getCustomer().getId() == customerId && invoiceLagi.getInvoiceStatus() == InvoiceStatus.Ongoing)
            {
                return false;
            }
        }
        INVOICE_DATABASE.add(invoice);
        lastid = invoice.getId();

        return true;
    }


    public static boolean changeInvoiceStatus(int id, InvoiceStatus status)
    {
        for(Invoice invoice : INVOICE_DATABASE)
        {
            if(status.equals(InvoiceStatus.Ongoing))
            {
                return true;
            }
        }
        return false;
    }

    public static boolean removeInvoice(int id)
    {
        for(Invoice invoice : INVOICE_DATABASE)
        {
            if(id == invoice.getId())
            {
                INVOICE_DATABASE.remove(invoice);
                return true;
            }
        }
        return false;
    }
}

