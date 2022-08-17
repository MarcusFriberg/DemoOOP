/**
 * Abstract class Person
 * An abstract class can not be initialized into an object. In our case, this class consist of some properties
 * and methods that every Person shares. It will be the superclass of Employee. If the application would later
 * have a class for customer, then it could be a subclass of Person as well. That is why we use this instead of
 * putting the properties and methods of Person into the Employee class.
 */
public abstract class Person {
    // Properties
    private String firstName;
    private String lastName;
    private boolean happy;
    private boolean busy;

    // Constructor
    protected Person(String firstName, String lastName, boolean happy, boolean busy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.happy = happy;
        this.busy = busy;
    }

    // Methods
    public void presentSelf() {
        System.out.println(firstName + ": My name is " + firstName + " " + lastName);
    }

    public void greetEveryone() {
        System.out.println(firstName + ": Hello everyone");
    }

    public void greetPerson(Person thePersonToGreet) {
        System.out.println(firstName + ": Hi there " + thePersonToGreet.getFirstName());
    }

    // Setter & Getter methods
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isHappy() {
        return happy;
    }

    public void setHappy(boolean happy) {
        this.happy = happy;
    }

    public boolean isBusy() {
        return busy;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }
}
