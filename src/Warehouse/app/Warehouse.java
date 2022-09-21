package Warehouse.app;

import java.util.ArrayList;

public class Warehouse {
    private static final int capacity = 10;
    private ArrayList<Delivery> deliveries = new ArrayList<>();

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
