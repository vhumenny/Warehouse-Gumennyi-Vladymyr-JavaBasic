package Warehouse.app;


import java.util.ArrayList;

public class DeliveryRegistrerInWarehouse {


    public void registerDeliveryinWarehouse (Delivery delivery, Warehouse warehouse){

        ArrayList <Delivery> deliveries= warehouse.getDeliveries();
        deliveries.add(delivery);

    }




}
