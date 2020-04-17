package fahrialamsyah.jfood.controller;
import fahrialamsyah.jfood.*;
import org.springframework.web.bind.annotation.*;

import fahrialamsyah.jfood.InvoiceNotFoundException;
import java.util.ArrayList;
/**
 * Write a description of class JFood here.
 *
 * @author Fahri Alamsyah
 * @version 17 - 04 -2020
 */

@RequestMapping("/Invoice")
@RestController
public class InvoiceController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Invoice> getAllInvoice() {
        return DatabaseInvoice.getInvoiceDatabase();
    }

    @RequestMapping("/{id}")
    public Invoice getInvoiceById(@PathVariable int id) throws InvoiceNotFoundException {
        Invoice invoice = null;
        try {
            invoice = DatabaseInvoice.getInvoiceById(id);
        } catch (InvoiceNotFoundException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return invoice;
    }

    @RequestMapping(value = "/customer/{customerId}", method = RequestMethod.GET)
    public ArrayList<Invoice> getInvoiceByCustomer(@PathVariable int customerId) throws CustomerNotFoundException {
        return DatabaseInvoice.getInvoiceByCustomer(customerId);
    }

    @RequestMapping(value = "/InvoiceStatus/{id}", method=RequestMethod.PUT)
    public Invoice changeInvoiceStatus(@PathVariable int id,
                                       @RequestParam InvoiceStatus status) {
        boolean check = DatabaseInvoice.changeInvoiceStatus(id, status);
        if (check) {
            try {
                return DatabaseInvoice.getInvoiceById(id);
            } catch (InvoiceNotFoundException a) {
            System.out.println(a.getMessage());
        }
    }
    return null;
}
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Boolean removeInvoice(@PathVariable int id) {
        try {
            if (DatabaseInvoice.removeInvoice(id)){
                return true;
            }
        } catch (InvoiceNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    @RequestMapping(value = "/createCashInvoice", method = RequestMethod.POST)
    public Invoice addCashInvoice(@RequestParam(value = "foodIdList") ArrayList<Integer> foodIdList,
                                  @RequestParam(value = "customerId") int customerId,
                                  @RequestParam(value = "deliveryFee") int deliveryFee) throws CustomerNotFoundException {

        ArrayList<Food> foodList = new ArrayList<>();
        Customer customer = null;
        for (Integer temp: foodIdList) {
            try {
                foodList.add(DatabaseFood.getFoodById(temp));
            } catch (FoodNotFoundException e) {
                e.printStackTrace();
            }
        }

        try {
            customer = DatabaseCustomer.getCustomerById(customerId);
        } catch (CustomerNotFoundException e) {
            e.printStackTrace();
        }
        Invoice input = new CashInvoice(DatabaseInvoice.getLastId() + 1, foodList,
                customer,
                deliveryFee);
        input.setTotalPrice();

        try {
            DatabaseInvoice.addInvoice(input);
        } catch (OngoingInvoiceAlreadyExistsException e) {
            e.printStackTrace();
        }

        Invoice temp;
        try {
            temp = DatabaseInvoice.getInvoiceById(DatabaseInvoice.getLastId());
            return temp;
        } catch (InvoiceNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    @RequestMapping(value = "/createCashlessInvoice", method = RequestMethod.POST)
    public Invoice addCashlessInvoice(@RequestParam(value="name") String name,
                                      @RequestParam(value="FoodIdList") ArrayList<Integer> foodIdList,
                                      @RequestParam(value="CustomerId") int customerId,
                                      @RequestParam(value="PromoCode") String promo)
    {
        ArrayList<Food> foods = new ArrayList<>();
        for (int food : foodIdList) {
            try {
                foods.add(DatabaseFood.getFoodById(food));
            } catch (FoodNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            Invoice invoice = new CashlessInvoice(DatabaseInvoice.getLastId()+1, foods, DatabaseCustomer.getCustomerById(customerId), DatabasePromo.getPromoByCode(promo));
            DatabaseInvoice.addInvoice(invoice);
            return invoice;
        } catch (CustomerNotFoundException | OngoingInvoiceAlreadyExistsException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}