package Warehouse.app;

import Warehouse.app.Users.Client;

import java.util.ArrayList;

public class Rack {

    private final ArrayList <Delivery> deliveries;
    private final int number;
    private final int capacity;

    public Rack(int number, RackType rackType) {
        this.number = number;
        this.capacity = rackType.getCapacity();
        this.deliveries = new ArrayList<Delivery>(capacity);
    }

    public ArrayList<Delivery> getDeliveries() {
        return deliveries;
    }
    public int getNumber() {
        return number;
    }
    public int getCapacity() {
        return capacity;
    }
    @Override
    public String toString() {
        return "Rack{" +
                "deliveries=" + deliveries +
                ", number=" + number +
                '}';
    }
}
