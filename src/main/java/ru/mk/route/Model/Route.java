package ru.mk.route.Model;

public class Route {
    public Route() {
    }

    public Route(int id, boolean is_ready, int time) {
        this.id = id;
        this.is_ready = is_ready;
        this.time = time;
    }

    int id;

    public boolean isIs_ready() {
        return is_ready;
    }

    public void setIs_ready(boolean is_ready) {
        this.is_ready = is_ready;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    boolean is_ready;
    int time;

}
