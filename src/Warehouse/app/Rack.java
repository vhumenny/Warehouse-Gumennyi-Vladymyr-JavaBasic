package Warehouse.app;

import java.util.ArrayList;

public class Rack {

    private final ArrayList <Client> clients = new ArrayList<>();
    private final int number;
    private final int capacity;

    public Rack(int number, int capacity) {
        this.number = number;
        this.capacity = capacity;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public int getNumber() {
        return number;
    }

    public int getCapacity() {
        return capacity;
    }
}
