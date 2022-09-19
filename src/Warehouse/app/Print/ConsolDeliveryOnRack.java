package Warehouse.app.Print;

import Warehouse.app.Delivery;
import Warehouse.app.Rack;
import Warehouse.app.Warehouse;

import java.util.ArrayList;

public class ConsolDeliveryOnRack implements DeliveryOnRackWriter{



    @Override
    public void printDeliveryInfo(Rack rack) {

        ArrayList<Delivery> delivery = new ArrayList<>();

        for (int i = 0; i < rack.getCapacity(); i++) {

            delivery.add(delivery.get(1));
        }

    }

    @Override
    public void printWarehouseInfo(Warehouse warehouse) {

    }
}
