package Warehouse.app;

public class Main {
    public static void main(String[] args) {

        Rack rack1 = new Rack(1,RackType.BIG);
        Rack rack2 = new Rack(2,RackType.SMALL);

        Warehouse warehouse = new Warehouse();

        warehouse.addRacks(rack1);
        warehouse.addRacks(rack2);

        System.out.println(warehouse);
//        while (true){
//            System.out.println("Hello, please choose an option: \nto register new client enter 'r' " +
//                    "\nto print info about client enter 'p'" + "\nto print info ");










    }
}