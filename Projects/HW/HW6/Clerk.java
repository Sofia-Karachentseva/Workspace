package Projects.HW.HW6;
//role: call to the customer and answer incoming calls
public class Clerk extends BankEmployees{
    public Clerk(String name, int id, String dateOfBirth, String address) {
        super(name, id, Constants.ClerkType, Constants.CleckDefaultSalary, dateOfBirth, address);
    }
    public void makeCall(String customerName){
        System.out.println(String.format("Connected to customer %s", customerName));
    }
    public void getCall(String customerName){
        System.out.println(String.format("Answered to customer %s", customerName));
    }
}
