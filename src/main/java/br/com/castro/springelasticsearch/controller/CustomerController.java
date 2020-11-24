package br.com.castro.springelasticsearch.controller;/*
 * @Autor Elias Castro em 24/11/2020
 */

import br.com.castro.springelasticsearch.model.Customer;
import br.com.castro.springelasticsearch.repository.CustomerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    private CustomerRepository repository;

    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/findAll")
    public Iterable<Customer> findAllCustomer(){
        return repository.findAll();
    }

    @GetMapping("/findByFirstName/{firstName}")
    public List<Customer> findByFirstName(@PathVariable String firstName){
        return repository.findByFirstname(firstName);
    }

    @PostMapping("/saveCustomer")
    public int saveCustomer(@RequestBody List<Customer> customers){
        repository.saveAll(customers);
        return customers.size();
    }


}
