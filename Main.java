import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manage manage = new Manage();
        while (true) {
            System.out.println("--------------------choose command---------------------");
            System.out.println("Enter 1: To add household.");
            System.out.println("Enter 2: To delete household.");
            System.out.println("Enter 3: To information bill of household.");
            System.out.println("Enter 4: To exit.");
            System.out.print("Choose: "); String choose = scanner.nextLine();
            switch (choose) {
                case "1":{
                    System.out.println("--------------------enter information---------------------");

                    System.out.print("Fullname of household head: "); String fullnameOfHouseholdHead = scanner.nextLine();
                    System.out.print("Home number: "); int homeNumber = scanner.nextInt();
                    System.out.print("Electric meter code: "); int electricMeterCode = scanner.nextInt(); scanner.nextLine();
                    System.out.print("Electric number old: "); int electricNumberOld = scanner.nextInt();
                    System.out.print("Electric number new: "); int electricNumberNew = scanner.nextInt(); scanner.nextLine();
                    Bill bill = new Bill(fullnameOfHouseholdHead, homeNumber, electricMeterCode, electricNumberOld, electricNumberNew);
                    manage.electricBill(homeNumber);
                    System.out.println(bill.toString());
                    manage.addCustomer(bill);
                    break;
                }
                    
                case "2":{
                    System.out.print("Enter home number: "); int homeNumber = scanner.nextInt(); scanner.nextLine();
                    manage.delete(homeNumber);
                    break;
                }
                case "3":{
                    manage.showHousehold();
                    break;
                }
                    
                case "4":{
                    scanner.close();
                    return;
                }
                default:
                System.out.println("Invalid.");
                    break;
            }
        }
    }
}
