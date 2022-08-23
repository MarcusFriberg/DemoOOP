package interfaces;
// Imports
import classes.Contest;

/**
 * Interface Developer, all Developer-classes that implements this interface must implement
 * the methods of this interface.
 */
public interface Developer {
    // Methods
    void participateInCodingContest(Contest theContest);
    void code();

    /**
     * String getFullName is needed because we are using this interface as a data type for a parameter in a method,
     * and we need to be able to access the first- and lastname of the object passed as a parameter.
     * There are other ways to accomplish this, but they will not be covered in this course.
     */
    String getFullName();
}
