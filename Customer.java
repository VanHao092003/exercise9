public class Customer {
    private String fullnameOfHouseholdHead;
    private int homeNumber;
    private int electricMeterCode;
    
    public Customer(String fullnameOfHouseholdHead, int homeNumber, int electricMeterCode) {
        this.fullnameOfHouseholdHead = fullnameOfHouseholdHead;
        this.homeNumber = homeNumber;
        this.electricMeterCode = electricMeterCode;
    }
    public String getFullnameOfHouseholdHead() {
        return fullnameOfHouseholdHead;
    }
    public void setFullnameOfHouseholdHead(String fullnameOfHouseholdHead) {
        this.fullnameOfHouseholdHead = fullnameOfHouseholdHead;
    }
    public int getHomeNumber() {
        return homeNumber;
    }
    public void setHomeNumber(int homeNumber) {
        this.homeNumber = homeNumber;
    }
    public int getElectricMeterCode() {
        return electricMeterCode;
    }
    public void setElectricMeterCode(int electricMeterCode) {
        this.electricMeterCode = electricMeterCode;
    }

    @Override
    public String toString() {
        return "Information of household [ fullname of household head: " + fullnameOfHouseholdHead + ", Home number: " + homeNumber + ", Electric meter code: " + electricMeterCode + "]";
    }
    
}
