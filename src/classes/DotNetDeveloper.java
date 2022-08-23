package classes;
// Imports
import interfaces.Developer;

/**
 * Class classes.DotNetDeveloper
 * Subclass of classes.Employee(subclass of abstract class abstractClasses.Person) that implements the interface interfaces.Developer.
 */
public class DotNetDeveloper extends Employee implements Developer {
    // Properties
    private String favouriteLanguage = "C#";

    // Constructor
    public DotNetDeveloper(String firstName, String lastName, boolean happy, boolean busy, int employeeID, int salary) {
        super(firstName, lastName, happy, busy, employeeID, salary);
    }

    // Methods
    @Override
    public void participateInCodingContest(Contest theContest) {
        System.out.println(this.getFirstName() + " starts to create an amazing " + favouriteLanguage + "-app to win the " + theContest.getContestName());
    }

    @Override
    public void code() {
        System.out.println(this.getFirstName() + " starts writing beautiful " + favouriteLanguage + " code");
    }
    @Override
    public String getFullName() {
        return this.getFirstName() + " " + this.getLastName();
    }
}
