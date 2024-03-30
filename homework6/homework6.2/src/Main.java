public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Ivan", 30, 50000.0);
        Developer developer = new Developer("Taras", 32, 32735.35, "Average Java developer");

        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}