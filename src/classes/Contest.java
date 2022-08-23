package classes;

/**
 * Class classes.Contest
 * A simple POJO(plain old java object)-class. Nothing fancy here, just a name and moderator of a contest
 * that any classes.Employee can start.
 */
public class Contest {
    // Properties
    private String contestName;
    private Employee moderator;

    // Constructors
    public Contest() {
        // Empty Constructor
    }

    public Contest(String contestName, Employee moderator) {
        this.contestName = contestName;
        this.moderator = moderator;
    }

    // Setter & Getter Methods
    public String getContestName() {
        return contestName;
    }

    public void setContestName(String contestName) {
        this.contestName = contestName;
    }

    public Employee getModerator() {
        return moderator;
    }

    public void setModerator(Employee moderator) {
        this.moderator = moderator;
    }
}
