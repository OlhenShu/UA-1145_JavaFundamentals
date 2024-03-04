package homeworks.homework2.Practical;

public class Practical_task2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("Nastia");
        employee1.setRate(11);
        employee1.setHours(9);

        Employee employee2 = new Employee("Anna", 9);
        employee2.setHours(5.2);

        Employee employee3 = new Employee("Alice", 10, 5);

        System.out.println("Employee1: " + employee1);
        System.out.println("Employee2: " + employee2);
        System.out.println("Employee3: " + employee3);

        System.out.println(Employee.getTotalSum());
    }
}

class Employee {
    public static final double Bonuses = 0.1;
    static private double totalSum = 0.0;
    private String name;
    private double rate;
    private double hours;

    public Employee() {
    }

    public Employee(String name, double rate) {
        this.name = name;
        setRate(rate);

    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        setRate(rate);
        setHours(hours);
    }

    public double getSalary() {
        return rate * hours;
    }

    public double getBonuses() {
        return Bonuses * getSalary();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(double rate) {
        double oldSalary = getSalary();
        this.rate = rate;
        double newSalary = getSalary();
        totalSum += newSalary - oldSalary;

    }

    public void setHours(double hours) {
        double oldSalary = getSalary();
        this.hours = hours;
        double newSalary = getSalary();
        totalSum += newSalary - oldSalary;
    }

    public static double getTotalSum() {
        return (1 + Bonuses) * totalSum;
    }

    public static void setTotalSum(double totalSum) {
        Employee.totalSum = totalSum;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                ", salary= " + getSalary() +
                ", bonuses= " + getBonuses() +
                '}';
    }
}