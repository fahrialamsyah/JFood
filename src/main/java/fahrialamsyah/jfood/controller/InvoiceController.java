package fahrialamsyah.jfood.controller;

import fahrialamsyah.jfood.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

/**
 * <h1>Invoice Controller<h1>
 * Kelas ini berfungsi untuk menjadi wadah untuk invoice controller API android
 *
 * @author Fahri Alamsyah
 * @version 30 - 05 - 2020
 *
 */
@RequestMapping("/invoice")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class InvoiceController {

    @RequestMapping(value="", method = RequestMethod.GET)
    public ArrayList<Invoice> getAllInvoice(){
        ArrayList<Invoice> ret;
        ret = DatabaseInvoice.getInvoiceDatabase();
        return ret;
    }

    @RequestMapping(value="{id}", method = RequestMethod.GET)
    public Invoice getInvoiceById(@PathVariable int id){
        Invoice invoice = null;
        try{
            invoice = DatabaseInvoice.getInvoiceById(id);
            return invoice;
        }catch (InvoiceNotFoundException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @RequestMapping(value="/customer/{customerId}", method = RequestMethod.GET)
    public ArrayList<Invoice> getInvoiceByCustomer(@PathVariable int customerId){
        ArrayList<Invoice> ret;
        try {
            ret = DatabaseInvoice.getInvoiceByCustomer(customerId);
            return ret;
        }catch (CustomerNotFoundException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @RequestMapping(value ="/invoiceStatus/{invoiceId}", method = RequestMethod.PUT)
    public Invoice changeInvoice(@PathVariable int invoiceId, @RequestParam(value = "Status")InvoiceStatus status){
        Invoice invoice;
        if( DatabaseInvoice.changeInvoiceStatus(invoiceId,status)){
            try{
                invoice = DatabaseInvoice.getInvoiceById(invoiceId);
                return invoice;
            }catch (InvoiceNotFoundException e){
                System.out.println(e.getMessage());
            }
        }
        return null;

    }

    @RequestMapping(value ="{invoiceId}", method = RequestMethod.DELETE)
    public boolean removeInvoice(@PathVariable int invoiceId){
        try{
            if (DatabaseInvoice.removeInvoice(invoiceId)) {
                return true;
            }
        }catch (InvoiceNotFoundException e){
            System.out.println(e.getMessage());

        }
        return false;
    }


    @RequestMapping(value = "/createCashInvoice", method = RequestMethod.POST)
    public Invoice addCashInvoice(@RequestParam(value="foodIdList") ArrayList<Integer> foodIdList,
                                  @RequestParam(value="totalPrice") int totalPrice,
                                  @RequestParam(value="customerId") int customerId,
                                  @RequestParam(value="deliveryFee", required = false) Integer deliveryFee)
    {
        Invoice cashInvoice = null;
        ArrayList<Food> foodList = new ArrayList<>();

        for (Integer foodId : foodIdList){
            try{
                foodList.add(DatabaseFood.getFoodById(foodId));
            }catch (FoodNotFoundException e){
                System.out.println(e.getMessage());
            }
        }

        if (deliveryFee != null){
            cashInvoice = new CashInvoice(DatabaseInvoice.getLastid() + 1, foodList, totalPrice, DatabaseCustomerPostgreBaru.getCustomer(customerId), deliveryFee);
            //cashInvoice.setTotalPrice();
        }
        else{
            cashInvoice = new CashInvoice(DatabaseInvoice.getLastid() + 1, foodList, totalPrice, DatabaseCustomerPostgreBaru.getCustomer(customerId));
            //cashInvoice.setTotalPrice();
        }

        try{
            DatabaseInvoice.addInvoice(cashInvoice);
        }catch (OngoingInvoiceAlreadyExistsException e){
            System.out.println(e.getMessage());
        }

        Invoice temp;
        try{
            temp = DatabaseInvoice.getInvoiceById(DatabaseInvoice.getLastid());
            return temp;
        }catch (InvoiceNotFoundException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @RequestMapping(value = "/createCashlessInvoice", method = RequestMethod.POST)
    public Invoice addCashlessInvoice(@RequestParam(value="foodIdList") ArrayList<Integer> foodIdList,
                                      @RequestParam(value="totalPrice") int totalPrice,
                                      @RequestParam(value="customerId") int customerId,
                                      @RequestParam(value="Promo", required = false) String promoCode)
    {
        Invoice cashlessinvoice = null;
        ArrayList<Food> foodList = new ArrayList<>();

        for (Integer foodId : foodIdList){
            try{
                foodList.add(DatabaseFood.getFoodById(foodId));
            }catch (FoodNotFoundException e){
                System.out.println(e.getMessage());
            }
        }

        if (promoCode == null){
            cashlessinvoice = new CashlessInvoice(DatabaseInvoice.getLastid() + 1, foodList, totalPrice, DatabaseCustomerPostgreBaru.getCustomer(customerId));
            //cashlessinvoice.setTotalPrice();
        }
        else{
            cashlessinvoice = new CashlessInvoice(DatabaseInvoice.getLastid() + 1, foodList, totalPrice, DatabaseCustomerPostgreBaru.getCustomer(customerId), DatabasePromo.getPromoByCode(promoCode)) ;
            //cashlessinvoice.setTotalPrice();
        }

        try{
            DatabaseInvoice.addInvoice(cashlessinvoice);
        }catch (OngoingInvoiceAlreadyExistsException e){
            System.out.println(e.getMessage());
        }

        Invoice temp;
        try{
            temp = DatabaseInvoice.getInvoiceById(DatabaseInvoice.getLastid());
            return temp;
        } catch (InvoiceNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}