/**
 * DESCRIPTION
 * This is a small Java-project used in an OOP-class to visualize some key concepts in object-oriented programming.
 * The Java code is kept at a very basic level that should be clear without deeper understanding of Java and only gets
 * as advanced as needed to visualize the concepts and make the application work.
 *
 * ASSIGNMENT
 * Clone this project from IntelliJ's launch screen. Look at the structure and the classes, read the comments, look
 * for methods in the Employee, JavaDeveloper, DotNetDeveloper classes that are not used (method names in grey). Start
 * by making some changes in the Main class to make use of the functions not in use. Then, try to add som methods to the
 * classes and use them to make the interactions between the employee's more interesting.
 *
 * @author Marcus Friberg @ XLENT
 */
public class Main {
    public static void main(String[] args) {
        // Create some employees
        Employee employee1 = new Employee("Bertram", "Gilfoyle", true, true, 1, 40000);
        JavaDeveloper employee2 = new JavaDeveloper("Dinesh", "Chugtai", false, false, 2, 40000);
        DotNetDeveloper employee3 = new DotNetDeveloper("Nelson", "Bighetti", true, false, 3, 30000);

        // Create a contest
        Contest theContest = new Contest("Pied pipers coding contest 2022", employee1);

        // Greet some people, announce the contest and make some devs enter the contest
        employee1.greetEveryone();
        employee2.greetPerson(employee1);
        employee3.greetPerson(employee1);
        System.out.println("-----------");
        employee1.startContest(theContest);
        System.out.println("-----------");
        employee2.participateInCodingContest(theContest);
        employee3.participateInCodingContest(theContest);
        System.out.println("-----------");
        employee1.announceWinnerOfContest(theContest, employee3);
    }
}