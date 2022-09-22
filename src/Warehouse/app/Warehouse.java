package Warehouse.app;

import java.util.ArrayList;

public class Warehouse {
    private static final int capacity = 10;
    private final ArrayList<Delivery> deliveriesInWarehouse = new ArrayList<>(capacity);

    public ArrayList<Delivery> getDeliveriesInWarehouse() {
        return deliveriesInWarehouse;
    }
    @Override
    public String toString() {
        return "Warehouse{" +
                "deliveries=" + deliveriesInWarehouse +
                '}';
    }
}
