package Warehouse.app;

import Warehouse.app.Users.Adresee;
import Warehouse.app.Users.Client;

public class Delivery {

   private final Integer deliveryId;
   private final int deliveryType;
   private final Client clientInfo;
   private final Adresee adreseeInfo;

   public Delivery(Integer deliveryId, DeliveryType deliveryType, Client clientInfo, Adresee adresee) {
      this.deliveryId = deliveryId;
      this.deliveryType = deliveryType.getDaysToDeliver();
      this.clientInfo = clientInfo;
      this.adreseeInfo = adresee;
   }
   public Integer getDeliveryId() {
      return deliveryId;
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
              ", deliveryType=" + deliveryType +
              ", clientInfo=" + clientInfo +
              ", adreseeInfo=" + adreseeInfo +
              '}';
   }
}
