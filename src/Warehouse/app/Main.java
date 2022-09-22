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

        int number=0;

        System.out.println("""
                Hello, please choose a command:\s
                to register new delivery enter '1'\s
                to print info about all the deliveries on warehouse enter '2'\s
                to print info about registered delivery enter '3'\s
                or to finish the program enter 'esc'.""");

        while (true){

            System.out.println("please enter command:");
            command = scanner.next();
            giveCommand(warehouse,deliveryRegistrerInWarehouse,scanner,command,random,consolDeliveryOnWarehouse,number);

            if(command.contains("esc")){
                System.out.println("You chose to finish the program");
                System.exit(1);}
        }
    }
    public static void giveCommand (Warehouse warehouse,
                                    DeliveryRegistrerInWarehouse deliveryRegistrerInWarehouse, Scanner scanner,
                                    String command, Random random, ConsolDeliveryOnWarehouse consolDeliveryOnWarehouse,
                                    int number){
        switch (command){
            case "1":
                System.out.println("You chose to register new delivery");
                registrateDelivery(scanner,random,warehouse,deliveryRegistrerInWarehouse);
                break;
            case "2":
                System.out.println("You chose to print info about warehouse");
                consolDeliveryOnWarehouse.printWarehouseInfo(warehouse);
                break;
            case "3":
                consolDeliveryOnWarehouse.printDeliveryInfo(warehouse,number,scanner);
            case "esc":
                break;
            default:
                System.err.println("You chose the wrong option! Try again!");
                break;
        }

    }

    private static void registrateDelivery (Scanner scanner, Random random, Warehouse warehouse,
                                            DeliveryRegistrerInWarehouse deliveryRegistrerInWarehouse){
        Integer deliveryId = random.nextInt(1,100);
        String chooseDeliveryType;
        System.out.println("Please choose the delivery type, 'g' for gold, 's' for silver, 'r' for regular: ");
        chooseDeliveryType = scanner.next();
        DeliveryType deliveryType=null;
        switch (chooseDeliveryType) {
            case "g" -> deliveryType = DeliveryType.GOLD;
            case "s" -> deliveryType = DeliveryType.SILVER;
            case "r" -> deliveryType = DeliveryType.REGULAR;
            default -> System.err.println("You chose the wrong option! Try again!");
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

        System.out.println(delivery);
        deliveryRegistrerInWarehouse.registerDeliveryinWarehouse(delivery,warehouse);
        System.out.println(warehouse);
    }


}