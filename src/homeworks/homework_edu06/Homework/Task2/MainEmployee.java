package homeworks.homework_edu06.Homework.Task2;

public class MainEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee("David", 42, 2000);
        Developer developer = new Developer("Elise", 25, 1200, "Java");

        System.out.println("Employee: ");
        System.out.println(employee.report());
        System.out.println(" ");

        System.out.println("Developer: ");
        System.out.println(developer.report());
        System.out.println(" ");

    }
}
