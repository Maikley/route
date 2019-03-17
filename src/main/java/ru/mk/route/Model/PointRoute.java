package ru.mk.route.Model;

public class PointRoute {
    public PointRoute() {
    }

    int id;

    public PointRoute(int id, int id_route) {
        this.id = id;
        this.id_route = id_route;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_route() {
        return id_route;
    }

    public void setId_route(int id_route) {
        this.id_route = id_route;
    }

    int id_route;
}
