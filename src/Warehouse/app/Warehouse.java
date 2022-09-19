package Warehouse.app;

import java.util.ArrayList;

public class Warehouse {
    private static final int capacity = 2;
    private final ArrayList<Rack> racks = new ArrayList<>(capacity);
    private int racksCounter=0;

    public void addRacks (Rack rack){
        racks.add(racksCounter, rack);
        racksCounter++;
    }
    public ArrayList<Rack> getRacks() {
        return racks;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "racks=" + racks +
                '}';
    }
}
