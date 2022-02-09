public class Bill extends Customer{
    private int electricNumberOld;
    private int electricNumberNew;
    private int theMoneyHaveToPay;

    public Bill(String fullnameOfHouseholdHead, int homeNumber, int electricMeterCode, int electricNumberOld,int electricNumberNew) {
        super(fullnameOfHouseholdHead, homeNumber, electricMeterCode);
        this.electricNumberOld = electricNumberOld;
        this.electricNumberNew = electricNumberNew;
    }
    public int getElectricNumberOld() {
        return electricNumberOld;
    }
    public void setElectricNumberOld(int electricNumberOld) {
        this.electricNumberOld = electricNumberOld;
    }
    public int getElectricNumberNew() {
        return electricNumberNew;
    }
    public void setElectricNumberNew(int electricNumberNew) {
        this.electricNumberNew = electricNumberNew;
    }
    public int getTheMoneyHaveToPay() {
        return theMoneyHaveToPay;
    }
    public void setTheMoneyHaveToPay(int theMoneyHaveToPay) {
        this.theMoneyHaveToPay = theMoneyHaveToPay;
    }

    @Override
    public String toString() {
        return super.toString() +  "information electric number [ electric number old: " + electricNumberOld + ", electric number new: " + electricNumberNew + ", the money have to pay: " + theMoneyHaveToPay + "]";
    }
}
