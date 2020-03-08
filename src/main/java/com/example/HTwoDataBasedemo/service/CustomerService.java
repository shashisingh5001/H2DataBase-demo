package com.example.HTwoDataBasedemo.service;

import com.example.HTwoDataBasedemo.CustomerRepository;
import com.example.HTwoDataBasedemo.customer.Customer;
import javafx.print.Collation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

      @Autowired
      private CustomerRepository customerRepository;

    public List<Customer > getCustomers(){

        List<Customer> customerList=new ArrayList<>();

        customerRepository.findAll().forEach(customerList::add);
         return customerList;
    }

    public void addCustomer(Customer customer){
        customerRepository.save(customer);
    }

    public void deleteCustomer(int id)
    {
        customerRepository.deleteById(id);
    }

    public Optional<Customer> findCustomer(Integer id)
    {
       return customerRepository.findById(id);
    }


    public Iterable<Customer> getCustomerBYCity(String city) {
        return customerRepository.findAllByCity(city);
    }
}

