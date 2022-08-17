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