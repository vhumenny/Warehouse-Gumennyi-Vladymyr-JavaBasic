package Warehouse.app.Print;

import Warehouse.app.Delivery;
import Warehouse.app.Rack;
import Warehouse.app.Warehouse;

public interface DeliveryOnRackWriter {

void printDeliveryInfo(Rack rack);

void printWarehouseInfo(Warehouse warehouse);
}
