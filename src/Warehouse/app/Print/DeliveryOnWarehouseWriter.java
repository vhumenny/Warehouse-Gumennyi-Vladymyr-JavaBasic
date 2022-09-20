package Warehouse.app.Print;

import Warehouse.app.Delivery;
import Warehouse.app.Warehouse;

public interface DeliveryOnWarehouseWriter {

void printDeliveryInfo(Delivery delivery);

void printWarehouseInfo(Warehouse warehouse);
}
