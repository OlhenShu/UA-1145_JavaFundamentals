package HomeWorks.HW6.Ex2;

public class Runner {

    public static void main(String[] args) {

        Employee employee = new Employee("John", 30, 5000);
        System.out.println(employee.report());
        Developer developer = new Developer("Jane", 25, "Developer", 8000.54);
        System.out.println(developer.report());

    }
}
