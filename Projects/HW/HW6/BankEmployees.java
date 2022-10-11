package Projects.HW.HW6;

public abstract class BankEmployees {

    private String employeeName;
    private int id;
    private String title;
    private String dateOfBirth;
    private long salary;
    private String address;

    public BankEmployees(String name, int id, String title, long salary, String dateOfBirth, String address) {
        this.employeeName = name;
        this.id = id;
        this.title = title;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void receiveSalary(){
        System.out.println("The salary was sent to the employee's bank account");
    }
    public String toString(){
        String txt = String.format("Employee name %s, Position: %s, Salary = %d ", employeeName, title, salary);
        return txt;
    }
}
