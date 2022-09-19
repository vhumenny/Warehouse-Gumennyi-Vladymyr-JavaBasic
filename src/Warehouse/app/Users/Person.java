package Warehouse.app.Users;

public abstract class Person {

    private final String fName;
    private final String mName;
    private final String lName;
    private final int telephone;

    public Person(String fName, String mName, String lName, int telephone) {
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.telephone = telephone;
    }

    public String getfName() {
        return fName;
    }

    public String getmName() {
        return mName;
    }

    public String getlName() {
        return lName;
    }

    public int getTelephone() {
        return telephone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fName='" + fName + '\'' +
                ", mName='" + mName + '\'' +
                ", lName='" + lName + '\'' +
                ", telephone=" + telephone +
                '}';
    }
}
