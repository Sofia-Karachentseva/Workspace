package Projects.HW.HW6;

public class BankEmployeesMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Sofia K", 1, "10.06.1999", "Calgary, Canada");
        Accountant accountant1 = new Accountant("Inna Te", 2, "02.22.1976", "Calgary, Canaada");
        Clerk clerk1 = new Clerk("Vasilisa K", 3, "07.29.2009", "Calgary, Canada");

        System.out.println(manager.toString());
        System.out.println(accountant1.toString());
        System.out.println(clerk1.toString());

        manager.fireEmployee("Fedor K");
        accountant1.createReport();
        clerk1.makeCall("Angela Y");
    }
}
