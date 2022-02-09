import java.util.ArrayList;
import java.util.List;

public class Manage {
    List<Customer> customers;

    public Manage(){
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer){
        this.customers.add(customer);
    }
    public void delete(int homeNumber){
        Customer customer =  this.customers.stream().filter(o -> o.getHomeNumber() == homeNumber).findFirst().orElse(null);
        if(customer != null){
            customers.remove(customer);
            System.out.println("You have successfully deleted.");
        } else{
            System.out.println("Invalid.");
        }
    }

    public void electricBill(int homeNumber){
        Customer customer = this.customers.stream().filter(o -> o.getHomeNumber() == homeNumber).findFirst().orElse(null);
        if(customer != null){
            Bill bill = (Bill) customer;
            int electricBill = (bill.getElectricNumberNew() - bill.getElectricNumberNew()) * 5;
            bill.setTheMoneyHaveToPay(electricBill);
        }
    }

    public void showHousehold(){
        for(Customer customer : customers){
            Bill bill =(Bill) customer;
            System.out.println(bill.toString());
        }
    }
}
