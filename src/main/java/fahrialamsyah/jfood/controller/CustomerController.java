package fahrialamsyah.jfood.controller;

import fahrialamsyah.jfood.*;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/customer")
@RestController
public class CustomerController {

    @RequestMapping("")
    public String indexPage(@RequestParam(value = "name", defaultValue = "world") String name) {
        return "Hello " + name;
    }

    @RequestMapping("/{id}")
    public Customer getCustomerById(@PathVariable int id) {
        Customer customer = null;
        try {
            customer = DatabaseCustomer.getCustomerById(id);
        } catch (CustomerNotFoundException e) {
            e.getMessage();
            return null;
        }
        return customer;
    }

    @RequestMapping(value = "/customer/login", method = RequestMethod.POST)
    public Customer loginCustomer(@RequestParam(value = "email") String email,
                                  @RequestParam(value = "password") String password) {
        {
        Customer customer = null;
        customer = DatabaseCustomer.getCustomerLogin(email, password);
        return customer;
    }

}
    @RequestMapping("/id")
    public Food getFoodById(@PathVariable int id) {
        Food food = null;
        try {
            food = DatabaseFood.getFoodById(id);
        } catch (FoodNotFoundException e) {
            e.getMessage();
            return null;
        }
            return food;
    }

    @RequestMapping(value = "/customer/register", method = RequestMethod.POST)
    public Customer registerCustomer(@RequestParam(value="name") String name,
                                @RequestParam(value="email") String email,
                                @RequestParam(value="password") String password)
    {
        Customer customer = new Customer(DatabaseCustomer.getLastId()+1, name, email, password);
        try {
            DatabaseCustomer.addCustomer(customer);
        } catch (EmailAlreadyExistsException e) {
            e.getMessage();
            return null;
        }
        return customer;
    }
}