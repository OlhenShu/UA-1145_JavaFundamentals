package homeWork3;

public class PracticalTask {
    public static void main(String[] args) {
        Employee Emp1 = new Employee();
        Emp1.setName("Anna");
        Emp1.setHours(10);
        Emp1.setRate(10);

        Employee Emp2 = new Employee("Ivan", 10);
        Emp2.setHours(10);

        Employee Emp3 = new Employee("Petro", 10, 10);

        System.out.println(Emp1 + "\n" + Emp2 + "\n" + Emp3);
        System.out.println("Total salary of employees is " + Employee.getTotalSum());
    }
}

class Employee {
    public static final double BONUS_RATE = 0.1;
    private static double totalSum;

    private String name;
    private double rate;
    private double hours;

    public Employee() {
    }

    public Employee(String name, double rate) {
        setName(name);
        setRate(rate);
    }

    public Employee(String name, double rate, double hours) {
        setName(name);
        setRate(rate);
        setHours(hours);
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public double getSalary() {
        return getRate() * getHours();
    }

    public double getBonuses() {
        return getSalary() * BONUS_RATE;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                ", salary=" + getSalary() +
                ", bonus=" + getBonuses() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        double oldSalary = getSalary();
        this.rate = rate;
        double newSalary = getSalary();
        totalSum += (newSalary - oldSalary) + getBonuses();
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        double oldSalary = getSalary();
        this.hours = hours;
        double newSalary = getSalary();
        totalSum += (newSalary - oldSalary) + getBonuses();
    }


}