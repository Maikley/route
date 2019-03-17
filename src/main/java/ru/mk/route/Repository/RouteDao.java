package ru.mk.route.Repository;

import org.springframework.data.repository.CrudRepository;
import ru.mk.route.Model.Route;

import java.util.List;

public interface RouteDao extends CrudRepository<Route,Integer> {



}
