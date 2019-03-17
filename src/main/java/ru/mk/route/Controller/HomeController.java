package ru.mk.route.Controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.mk.route.Model.Customer;
import ru.mk.route.Repository.CustomerDTO;

import java.util.Optional;

@RestController
@RequestMapping(value = {"/api"},produces="application/json")
public class HomeController {

    private CustomerDTO customerDTO;

    public HomeController(CustomerDTO customerDTO){
        this.customerDTO=customerDTO;
    }

    @GetMapping
    public Iterable<Customer> getById(){
        return  customerDTO.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Customer> getAllById(@PathVariable("id")Integer id){
        Optional<Customer> optionalCustomer=customerDTO.findById(id);
        if(optionalCustomer.isPresent()){
        return    new ResponseEntity<>(optionalCustomer.get(), HttpStatus.OK);
        }
        return    new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
    @PostMapping(consumes = "application/json")
    public Customer postId(@RequestBody Customer customer){
        return customerDTO.save(customer);
    }
}
