package HomeWork06.Task2;

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer("Ivan", 25, 50000, "Dream and act");
        Employee employee = new Employee("Tomas", 77, 120000);

        System.out.println(employee.report());
        System.out.println(developer.report());

    }
}
