package fahrialamsyah.jfood.controller;

import fahrialamsyah.jfood.*;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Email;
/**
 * <h1>Customer Controller<h1>
 * Kelas ini berfungsi untuk menjadi wadah untuk Customer Controller API android
 *
 * @author Fahri Alamsyah
 * @version 30 - 05 - 2020
 *
 */
@RequestMapping("/customer")
@CrossOrigin(origins = " ", allowedHeaders = "*")
@RestController
public class CustomerController
{

    @RequestMapping("")
    public String indexPage(@RequestParam(value="name", defaultValue="world") String name)
    {
        return "Hello " + name;
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Customer getCustomerById(@PathVariable int id)
    {
        Customer customer = null;
        try
        {
            customer = DatabaseCustomerPostgreBaru.getCustomer(id);
        }
        catch (Exception e)
        {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return customer;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Customer register(@RequestParam(value="name") String name,
                             @RequestParam(value="email") String email,
                             @RequestParam(value="password") String password)
    {
        try
        {
            return DatabaseCustomerPostgreBaru.insertCustomer(DatabaseCustomerPostgreBaru.getLastCustomerId()+1, name,  email,  password);
        }
        catch (Exception e)
        {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            return null;
        }

    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Customer loginCustomer(@RequestParam(value="email") String email,
                                  @RequestParam(value="password") String password)
    {
        Customer customer = null;

        try
        {
            customer = DatabaseCustomerPostgreBaru.getLogin(email, password);
        }
        catch (Exception e)
        {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            return null;
        }
        return customer;

    }
}