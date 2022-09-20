package Warehouse.app;

import java.util.ArrayList;

public class Warehouse {
    private static final int capacity = 10;
    private final ArrayList<Delivery> deliveries;

    public Warehouse(Delivery delivery) {
        this.deliveries = new ArrayList<>(this.capacity);
    }


    public ArrayList<Delivery> getDeliveries() {
        return deliveries;
    }


    @Override
    public String toString() {
        return "Warehouse{" +
                "deliveries=" + deliveries +
                '}';
    }
}
