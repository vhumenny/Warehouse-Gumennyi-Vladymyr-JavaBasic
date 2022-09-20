package Warehouse.app.Print;

import Warehouse.app.Delivery;
import Warehouse.app.Warehouse;

public class ConsolDeliveryOnWarehouse implements DeliveryOnWarehouseWriter{



    @Override
    public void printDeliveryInfo(Delivery delivery) {
        System.out.println(delivery);

    }

    @Override
    public void printWarehouseInfo(Warehouse warehouse) {

    }
}
