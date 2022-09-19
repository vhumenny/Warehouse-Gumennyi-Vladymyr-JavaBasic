package Warehouse.app.Users;

public class Adresee extends Person {

    private final String deliveryAdress;

    public Adresee(String adreseeFName, String adreseeMName, String adreseeLName, String deliveryAdress,
                   int adreseeTelephone) {
        super(adreseeFName, adreseeMName, adreseeLName, adreseeTelephone);
        this.deliveryAdress = deliveryAdress;
    }

    public String getDeliveryAdress() {
        return deliveryAdress;
    }

    @Override
    public String toString() {
        return "Adresee{" +
                "deliveryAdress='" + deliveryAdress + '\'' +
                '}';
    }
}
