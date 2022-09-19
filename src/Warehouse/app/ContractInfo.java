package Warehouse.app;


public class ContractInfo {
    private final int rackNumber;
    private final int placeNumber;

    public ContractInfo(int rackNumber, int placeNumber) {
        this.rackNumber = rackNumber;
        this.placeNumber = placeNumber;
    }
    public int getRackNumber() {
        return rackNumber;
    }
    public int getPlaceNumber() {
        return placeNumber;
    }


    @Override
    public String toString() {
        return "ContractInfo{" +
                "rackNumber=" + rackNumber +
                ", placeNumber=" + placeNumber +
                '}';
    }
}
