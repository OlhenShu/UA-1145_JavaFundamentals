package Task2;

public class Main {
    public static void main(String[] args) {
         Employee employee = new Employee("Jack", 20, 2000);
        System.out.println(employee.report());
        Developer developer = new Developer("Janny", 21, "Junior Java Developer", 5000);
        System.out.println(developer.report());
    }
}
