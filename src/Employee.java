/**
 * Class Employee
 * A subclass of Person and superclass of JavaDeveloper and DotNetDeveloper.
 * Adds properties and methods shared by all who are employees.
 * Can be initialized into objects.
 */
public class Employee extends Person {
    // Properties
    private int employeeID;
    private int salary;

    // Constructors
    public Employee(String firstName, String lastName, boolean happy, boolean busy) {
        super(firstName, lastName, happy, busy);
    }

    public Employee(String firstName, String lastName, boolean happy, boolean busy, int employeeID, int salary) {
        super(firstName, lastName, happy, busy);
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Methods
    public void complainToBossAboutSalary() {
        salary = salary + 1000;
    }

    public void startContest(Contest theContest) {
        System.out.println(this.getFirstName() + ": Im proud to announce " + theContest.getContestName());
    };

    // Setter & Getter Methods
    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

