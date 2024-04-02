package homeWork6.homeWork;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String report() {
        return String.format("Name: %s, Age: %d," +
                "Salary: \u20B4 %.2f.", name, age, salary);
    }
}
class Developer extends Employee{

    private String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }
    @Override
    public String report(){
        return String.format("%s, Position: %s", super.report(), position);    }
}
class RunEmployee{
    public static void main(String[] args) {
        Employee emp = new Employee("Andrii", 35, 3500);
        Developer dev = new Developer("Roman", 50, 6000, "Java developer");
        System.out.println(emp.report());
        System.out.println(dev.report());
    }



}