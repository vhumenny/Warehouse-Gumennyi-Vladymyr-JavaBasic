package Warehouse.app.Print;

import Warehouse.app.Delivery;
import Warehouse.app.Warehouse;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsolDeliveryOnWarehouse implements DeliveryOnWarehouseWriter{

    @Override
    public void printDeliveryInfo(Warehouse warehouse, int number, Scanner scanner) {
        ArrayList <Delivery> deliveries = warehouse.getDeliveriesInWarehouse();
        System.out.println("Please enter the number of the delivery: ");
        number = scanner.nextInt();
        System.out.println("Info about delivery number "+number+" : " +deliveries.get(number));
    }

    @Override
    public void printWarehouseInfo(Warehouse warehouse) {

        ArrayList <Delivery> deliveries = warehouse.getDeliveriesInWarehouse();
            System.out.println("All deliveries in warehouse: " +deliveries);
    }
}
