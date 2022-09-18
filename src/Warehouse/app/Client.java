package Warehouse.app;

public class Client {

    private final String lastName;
    private final String middleName;
    private final String firstName;
    private final String companyName;
    private final ContractInfo contractInfo;

    public Client(String lastName, String middleName, String firstName, String companyName, ContractInfo contractInfo) {
        this.lastName = lastName;
        this.middleName = middleName;
        this.firstName = firstName;
        this.companyName = companyName;
        this.contractInfo = contractInfo;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public ContractInfo getContractInfo() {
        return contractInfo;
    }

    @Override
    public String toString() {
        return "Client{" +
                "lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", contractInfo=" + contractInfo +
                '}';
    }
}
