
public class JavaDeveloper extends Employee implements Developer {
    // Properties
    private String favouriteLanguage = "Java";

    // Constructor
    public JavaDeveloper(String firstName, String lastName, boolean happy, boolean busy, int employeeID, int salary) {
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
}
