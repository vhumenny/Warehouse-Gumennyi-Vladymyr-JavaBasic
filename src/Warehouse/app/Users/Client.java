package Warehouse.app.Users;

public class Client extends Person {

    private final String departureAdress;


    public Client(String clientFName, String clientMName, String clientLName, int clientTelephone,
                  String departureAdress) {
        super(clientFName, clientMName, clientLName, clientTelephone);
        this.departureAdress = departureAdress;
    }

    public String getDepartureAdress() {
        return departureAdress;
    }

    @Override
    public String toString() {
        return "Client{" +
                "departureAdress='" + departureAdress + '\'' +
                "fName='" + getfName() + '\'' +
                ", mName='" + getmName() + '\'' +
                ", lName='" + getlName() + '\'' +
                ", telephone=" + getTelephone() +
                '}';
    }
}
