package ru.mk.route.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Getter
@Setter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String id_one_name;
    private String id_second_name;
    private String time;


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + id_one_name + '\'' +
                ", issue='" + id_second_name + '\'' +
                ", age='" + time + '\'' +
                '}';
    }



    public Customer() {
    }

    public Customer(int id, String id_one_name, String id_second_name, String time) {
        this.id = id;
        this.id_second_name=id_second_name;
        this.id_one_name = id_one_name;
        this.time = time;
    }



}
