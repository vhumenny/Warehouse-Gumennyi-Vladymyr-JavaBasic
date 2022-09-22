package Warehouse.app.Print;

import Warehouse.app.Warehouse;

import java.util.Scanner;

public interface DeliveryOnWarehouseWriter {

void printDeliveryInfo(Warehouse warehouse, int number, Scanner scanner);

void printWarehouseInfo(Warehouse warehouse);
}
