package Warehouse.app.Users;

import Warehouse.app.ContractInfo;

public class Client extends Person {

    private final String departureAdress;
    private final ContractInfo contractInfo;

    public Client(String clientFName, String clientMName, String clientLName, int clientTelephone, String departureAdress, ContractInfo contractInfo) {
        super(clientFName, clientMName, clientLName, clientTelephone);
        this.departureAdress = departureAdress;
        this.contractInfo = contractInfo;
    }

    public String getDepartureAdress() {
        return departureAdress;
    }

    public ContractInfo getContractInfo() {
        return contractInfo;
    }

    @Override
    public String toString() {
        return "Client{" +
                "departureAdress='" + departureAdress + '\'' +
                ", contractInfo=" + contractInfo +
                '}';
    }
}
