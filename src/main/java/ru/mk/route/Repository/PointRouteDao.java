package ru.mk.route.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import ru.mk.route.Model.Customer;
import ru.mk.route.Model.PointRoute;
import ru.mk.route.Model.Route;

public interface PointRouteDao extends CrudRepository<PointRoute,Integer> {
    @Query(value = "SELECT id FROM route id WHERE :dis MEMBER OF id.route")
    Iterable<Customer> findAllById(@Param("dis")Route route);
}
