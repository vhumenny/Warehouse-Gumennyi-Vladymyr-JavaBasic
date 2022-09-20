package Warehouse.app;

import Warehouse.app.Users.Adresee;
import Warehouse.app.Users.Client;

public class Delivery {

   private final Integer deliveryId;
   private final Integer numberInWarehouse;
   private final int deliveryType;
   private final Client clientInfo;
   private final Adresee adreseeInfo;

   public Delivery(Integer deliveryId, Integer numberInWarehouse, DeliveryType deliveryType, Client clientInfo, Adresee adresee) {
      this.deliveryId = deliveryId;
      this.numberInWarehouse = numberInWarehouse;
      this.deliveryType = deliveryType.getDaysToDeliver();
      this.clientInfo = clientInfo;
      this.adreseeInfo = adresee;
   }
   public Integer getDeliveryId() {
      return deliveryId;
   }
   public Integer getNumberInWarehouse() {
      return numberInWarehouse;
   }
   public int getDliveryType() {
      return deliveryType;
   }
   public Client getClientInfo() {
      return clientInfo;
   }
   public Adresee getAdreseeInfo() {
      return adreseeInfo;
   }

   @Override
   public String toString() {
      return "Delivery{" +
              "deliveryId=" + deliveryId +
              ", numberInWarehouse=" + numberInWarehouse +
              ", deliveryType=" + deliveryType +
              ", clientInfo=" + clientInfo +
              ", adreseeInfo=" + adreseeInfo +
              '}';
   }
}
