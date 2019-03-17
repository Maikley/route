package ru.mk.route.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mk.route.Service.CustomerService;

@RestController

public class Controller {

    @Autowired
    private CustomerService customerService;

   @RequestMapping(path = "feed")

    public void setData(){

       customerService.saveCustomerData();

    }
}
