package classes;
// Imports
import abstractClasses.Person;
import interfaces.Developer;


/**
 * Class classes.Employee
 * A subclass of abstractClasses.Person and superclass of classes.JavaDeveloper and classes.DotNetDeveloper.
 * Adds properties and methods shared by all who are employees.
 * Can be initialized into objects.
 */
public class Employee extends Person {
    // Properties
    private int employeeID;
    private int salary;

    // Constructors
    public Employee(String firstName, String lastName, boolean happy, boolean busy) {
        // super-keyword will pass the incoming parameters to the constructor of the super class (abstractClasses.Person)
        super(firstName, lastName, happy, busy);
    }

    public Employee(String firstName, String lastName, boolean happy, boolean busy, int employeeID, int salary) {
        // super-keyword will pass the incoming parameters to the constructor of the super class (abstractClasses.Person)
        super(firstName, lastName, happy, busy);
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Methods
    public void complainToBossAboutSalary() {
        salary = salary + 1000;
    }

    /**
     * This method may require some explanation.
     * @param theContest this is an object initialized from the classes.Contest-class. Just as we can pass something of a data type like int or String we can also
     *                   pass an object from a class that we have created.
     */
    public void startContest(Contest theContest) {
        System.out.println(this.getFirstName() + ": Im proud to announce " + theContest.getContestName());
    }

    /**
     * This method may require some explanation. It takes two parameters as explained below
     * @param theContest se description in the method above...
     * @param theDeveloper this is a really nice thing about interfaces. What we are looking to get here is the winner of the contest. But... the winner could be either
     *                     an instance of our class(an object) classes.JavaDeveloper, but it could also, occasionally, be an instance of our classes.DotNetDeveloper class. But both of those
     *                     classes have something in common, they both implement the interfaces.Developer interface, and we can use the Interface as data type of that parameter.
     *                     Making the method accept an instance of any class(an object) as a parameter as long as it implements the interfaces.Developer interface.
     *
     * The first part of the System.out.println is just to type out the name of the one speaking, and that would be the moderator of the contest.
     * We have an object (theContest), that object have a property of type classes.Employee as the moderator, so we first get the employee object with theContest.getModerator(),
     * then we add .getFirstName() to get the firstName from that classes.Employee-object.
     */
    public void announceWinnerOfContest(Contest theContest, Developer theDeveloper) {
        System.out.println(theContest.getModerator().getFirstName() + ": And the winner of " + theContest.getContestName() + " is " + theDeveloper.getFullName());
    }

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

