package Warehouse.app;

import Warehouse.app.Print.ConsolDeliveryOnWarehouse;
import Warehouse.app.Users.Adresee;
import Warehouse.app.Users.Client;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        ConsolDeliveryOnWarehouse consolDeliveryOnWarehouse = new ConsolDeliveryOnWarehouse();

        DeliveryRegistrerInWarehouse deliveryRegistrerInWarehouse = new DeliveryRegistrerInWarehouse();

        String command;

        System.out.println("Hello, please choose a command: \nto register new delivery enter 'r' " +
                "\nto print info about all the deliveries on warehouse enter 'p' " +
                "\nto print info about registered delivery enter 'd' \nor to finish the program enter 'esc' : ");

        registrateDelivery(scanner,random,warehouse,deliveryRegistrerInWarehouse,consolDeliveryOnWarehouse);

        while (true){

            command = scanner.next();
            giveCommand(warehouse,delivery,scanner,command,random);

            if(command=="esc")
                break;


        }

    }
    public static void giveCommand (Warehouse warehouse, Delivery delivery,
                                    DeliveryRegistrerInWarehouse deliveryRegistrerInWarehouse, Scanner scanner,
                                    String command, Random random, ConsolDeliveryOnWarehouse consolDeliveryOnWarehouse){

        switch (command){
            case "r":
                System.out.println("You chose to register new delivery");
                registrateDelivery(scanner,random,warehouse,deliveryRegistrerInWarehouse, consolDeliveryOnWarehouse);
                break;
            case "p":
                System.out.println("You chose to print info about warehouse");
                consolDeliveryOnWarehouse.printWarehouseInfo(warehouse);
                break;
            case "d":
                System.out.println("You chose to print info about registered delivery");
                consolDeliveryOnWarehouse.printDeliveryInfo(delivery);
                break;
            default:
                System.err.println("You chose the wrong option! Try again!");
                break;
        }

    }

    private static void registrateDelivery (Scanner scanner, Random random, Warehouse warehouse,
                                            DeliveryRegistrerInWarehouse deliveryRegistrerInWarehouse,
                                            ConsolDeliveryOnWarehouse consolDeliveryOnWarehouse){
        Integer deliveryId = random.nextInt(1,10000);
        String chooseDeliveryType;
        System.out.println("Please choose the delivery type, 'g' for gold, 's' for silver, 'r' for regular: ");
        chooseDeliveryType = scanner.next();
        DeliveryType deliveryType=null;
        switch (chooseDeliveryType){
            case "g":
                deliveryType=DeliveryType.GOLD;
                break;
            case "s":
                deliveryType=DeliveryType.SILVER;
                break;
            case "r":
                deliveryType=DeliveryType.REGULAR;
                break;
            default:
                System.err.println("You chose the wrong option! Try again!");
                break;
        }

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

        Delivery delivery = new Delivery(deliveryId,deliveryType,client,adresee);
        consolDeliveryOnWarehouse.printDeliveryInfo(delivery);

        System.out.println(delivery);
        deliveryRegistrerInWarehouse.registerDeliveryinWarehouse(delivery, warehouse);
        System.out.println(warehouse);
    }
}