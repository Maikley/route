package ru.mk.route.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.mk.route.Model.Customer;

@Repository
public interface CustomerDTO extends CrudRepository<Customer,Integer> {
}
