package PracticalOOP;


public class Employee {
    private static double BONUS = 0.1; // since the bonus is 10% the total salary will be 100% + 10%
    static double totalSum;
    private String name;
    private double rate;
    private int hours;
    private static double totalRate;
    private static int totalHours;


    public Employee() {
        this("N/A", 0, 0);
    }

    public Employee(double rate, int hours) {
        this.rate = rate;
        this.hours = hours;
        totalRate += rate;
        totalHours += hours;

    }
    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalRate += rate;
        totalHours += hours;
    }

    public void setRate(double rate) {
        totalRate -= rate;
        this.rate = rate;
        totalRate += rate;
    }

    public void setHours(int hours) {
        totalHours -= hours;
        this.hours = hours;
        totalHours += hours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static double getTotalSum() {
        System.out.println((totalRate * totalHours) + Employee.getBonuses(totalRate * totalHours));
        return (totalRate * totalHours) + Employee.getBonuses(totalRate * totalHours);

    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return this.rate * this.hours;
    }

    static public double getBonuses(double salary) {
        return (salary * BONUS);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public static void printStatistics(Employee employee) {
        System.out.println("The salary of this employee: " + employee.getName() + " is: " +
                employee.getSalary() +
                "the bonus is : " +  getBonuses(employee.getSalary()));
        System.out.println("The total salary with bonuses is: " + getTotalSum());
    }
}
