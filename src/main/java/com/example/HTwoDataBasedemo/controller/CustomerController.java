package com.example.HTwoDataBasedemo.controller;

import com.example.HTwoDataBasedemo.customer.Customer;
import com.example.HTwoDataBasedemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> getAllCustomer() {

        return customerService.getCustomers();

    }

    @PostMapping("/save")
    public void saveCustomers(@RequestBody Customer customer) {

        customerService.addCustomer(customer);


    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id)
    {
        customerService.deleteCustomer(id);
    }

    @GetMapping("/find/{id}")
    public Optional<Customer>find(@PathVariable Integer id)
    {
        return customerService.findCustomer(id);
    }

    @GetMapping("/getByCity/{city}")
    public Iterable<Customer> getCustomerByCity(@PathVariable String city)
    {
        return customerService.getCustomerBYCity(city);
    }

}
