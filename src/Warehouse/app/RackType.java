package Warehouse.app;

public enum RackType {

    BIG(10),
    SMALL(5);

    private final int capacity;

    RackType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
