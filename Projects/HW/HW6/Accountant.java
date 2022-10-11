package Projects.HW.HW6;
//role: open a new account, close account and create reports
public class Accountant extends BankEmployees{
    public Accountant(String name, int id, String dateOfBirth, String address) {
        super(name, id, Constants.AccountantType, Constants.AccountantDefaultSalary, dateOfBirth, address);
    }
    public void createReport(){
        System.out.println("Report created");
    }
}
