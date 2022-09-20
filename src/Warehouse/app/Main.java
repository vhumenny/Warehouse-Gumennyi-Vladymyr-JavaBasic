package Warehouse.app;

import Warehouse.app.Users.Adresee;
import Warehouse.app.Users.Client;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String command;

        System.out.println("Hello, please choose an option: \nto register new client enter 'r' " +
                "\nto print info about all the deliveries on warehouse enter 'p': ");

        registrateDelivery(scanner,random);



    }
    public static void registrateDelivery (Scanner scanner, Random random){
        Integer deliveryId = random.nextInt();
        String chooseDeliveryType;
        System.out.println("Please choose the delivery type, 'g' for gold, 's' for silver, 'r' for regular: ");
        chooseDeliveryType = scanner.next();
        DeliveryType deliveryType = DeliveryType.REGULAR;
//        while (true) {
//            if (chooseDeliveryType == "g") {
//                deliveryType = DeliveryType.GOLD;
//                break;
//            }
//            if (chooseDeliveryType == "s") {
//                deliveryType = DeliveryType.SILVER;
//                break;
//            }
//            if (chooseDeliveryType == "r") {
//                deliveryType = DeliveryType.REGULAR;
//                break;
//            }
//        }
        System.out.println("PLease enter the serial number for the delivery in warehouse: ");
        Integer numberInWarehouse = scanner.nextInt();
        System.out.println("Please enter client fName:");
        String clientFName = scanner.next();
        System.out.println("Please enter client mName:");
        String clientMName = scanner.next();
        System.out.println("Please enter client lName:");
        String clientLName = scanner.next();
        System.out.println("Please enter clients telephone:");
        int clientTelephone = scanner.nextInt();
        System.out.println("Please enter departure adress:");
        String departureAdress = scanner.next();
        System.out.println("Please enter adresee fName:");
        String adreseeFName = scanner.next();
        System.out.println("Please enter adresee mName:");
        String adreseeMName = scanner.next();
        System.out.println("Please enter adresee lName:");
        String adreseeLName = scanner.next();
        System.out.println("Please enter adresee telephone:");
        int adreseeTelephone = scanner.nextInt();
        System.out.println("Please enter delivery adress:");
        String deliveryAdress = scanner.next();

        Client client = new Client(clientFName,clientMName,clientLName,clientTelephone,departureAdress);
        Adresee adresee = new Adresee(adreseeFName,adreseeMName,adreseeLName,deliveryAdress,adreseeTelephone);

        Delivery delivery = new Delivery(deliveryId, numberInWarehouse, deliveryType,client,adresee);
    }
}