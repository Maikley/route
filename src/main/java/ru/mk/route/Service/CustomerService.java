package ru.mk.route.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mk.route.Model.Customer;
import ru.mk.route.Repository.CustomerDTO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Service
public class CustomerService {

    @Autowired
    private CustomerDTO customerDTO;

    String line="";

    public void saveCustomerData(){
        try {
            BufferedReader br=new BufferedReader(new FileReader("resources/data.csv"));
        while((line = br.readLine()) != null) {

        }
        String[] data=line.split(";");
        Customer c=new Customer();
        c.setId_one_name(data[0]);
        c.setId_second_name(data[1]);
        c.setTime(data[2]);
        customerDTO.save(c);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
