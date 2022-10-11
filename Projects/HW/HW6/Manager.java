package Projects.HW.HW6;

//\role: hire and fire employees
public class Manager extends BankEmployees {
    public Manager(String name, int id,  String dateOfBirth, String address) {
        super(name, id, Constants.ManagerType, Constants.ManagerDefaultSalary , dateOfBirth, address);
    }
    public void hireEmployee(String employeeName){
        System.out.println(String.format("The employee %s was hired", employeeName));
    }
    public void fireEmployee(String employeeName){
        System.out.println(String.format("The employee %s was fired", employeeName));
    }
}
