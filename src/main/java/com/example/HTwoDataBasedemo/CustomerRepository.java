package com.example.HTwoDataBasedemo;

import com.example.HTwoDataBasedemo.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {


    Iterable<Customer> findAllByCity(String city);
}
