package Warehouse.app.Print;

import Warehouse.app.Delivery;
import Warehouse.app.Warehouse;

import java.util.ArrayList;

public class ConsolDeliveryOnWarehouse implements DeliveryOnWarehouseWriter{



    @Override
    public void printDeliveryInfo(Delivery delivery) {
        System.out.println(delivery);
    }

    @Override
    public void printWarehouseInfo(Warehouse warehouse) {

        ArrayList <Delivery> deliveries = warehouse.getDeliveries();
        for (Delivery delivery: deliveries) {
            System.out.println(delivery.toString());
        }
    }
}
