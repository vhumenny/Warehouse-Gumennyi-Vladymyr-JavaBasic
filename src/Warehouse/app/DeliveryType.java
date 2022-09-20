package Warehouse.app;

public enum DeliveryType {

    GOLD(1),
    SILVER(2),
    REGULAR(3);

    private final int daysToDeliver;

    DeliveryType(int daysToDeliver) {
        this.daysToDeliver = daysToDeliver;
    }

    public int getDaysToDeliver() {
        return daysToDeliver;
    }
}
