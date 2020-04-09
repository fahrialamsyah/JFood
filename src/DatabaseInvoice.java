import javax.xml.crypto.Data;
import java.util.ArrayList;

public class DatabaseInvoice {
    private static ArrayList<Invoice> DATABASE_INVOICE = new ArrayList<>();
    private static  int lastId = 0;

    public static ArrayList<Invoice> getInvoiceDatabase() {
        return DATABASE_INVOICE;
    }

    public static int getLastId() {
        return lastId;
    }

    public static Invoice getInvoiceById(int id) {
        for (Invoice invoice: DATABASE_INVOICE) {
            if (invoice.getId() == id) {
                return invoice;
            }
        }
        return null;
    }

    public static ArrayList<Invoice> getInvoiceByCustomer(int customerId) {
        ArrayList<Invoice> temp = new ArrayList<>();

        for (Invoice invoice: DATABASE_INVOICE) {
            if (invoice.getCustomer().getId() == customerId) {
                temp.add(invoice);
            }
        }

        if (!temp.isEmpty()) {
            return temp;
        }
        return null;
    }

    public static boolean addInvoice(Invoice invoice) {

        for (Invoice temp: DATABASE_INVOICE) {
            if (temp.getCustomer().getId() == invoice.getCustomer().getId()
                    && temp.getInvoiceStatus().equals(InvoiceStatus.Ongoing)) {
                return false;
            }
        }

        DATABASE_INVOICE.add(invoice);
        lastId = invoice.getId();
        return true;

    }

    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus) {
        for (Invoice invoice: DATABASE_INVOICE) {
            if (invoice.getId() == id && invoice.getInvoiceStatus().equals(InvoiceStatus.Ongoing)){
                invoice.setInvoiceStatus(invoiceStatus);
                return true;
            }
        }
        return false;
    }

    public static boolean removeInvoice(int id) {
        for (Invoice invoice: DATABASE_INVOICE) {
            if (invoice.getId() == id) {
                DATABASE_INVOICE.remove(invoice);
                return true;
            }
        }
        return false;
    }
}
