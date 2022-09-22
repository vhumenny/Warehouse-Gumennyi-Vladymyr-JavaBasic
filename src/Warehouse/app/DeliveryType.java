package Warehouse.app;

public enum DeliveryType {

    GOLD("Gold - 1 day to deliver"),
    SILVER("Silver - 2 days to deliver"),
    REGULAR("Regular - 3 days to deliver");

    private final String daysToDeliver;

    DeliveryType(String daysToDeliver) {
        this.daysToDeliver = daysToDeliver;
    }

    public String getDaysToDeliver() {
        return daysToDeliver;
    }
}
