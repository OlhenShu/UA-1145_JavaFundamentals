package HomeWork03.PracticalTask03;


public class Employee {

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("Pedro");
        employee1.setRate(10.0);
        employee1.setHours(6);

        Employee employee2 = new Employee("Ivan", 5.0);
        employee2.setHours(5);

        Employee employee3 = new Employee("Anya", 11.0, 10);

        System.out.println("employ1: " + employee1);
        System.out.println("employ2: " + employee2);
        System.out.println("employ3: " + employee3);

        System.out.println("Total Salary: " + getTotalSum());
    }

    public static final double BONUSES = 0.1; // 10%
    private static double totalSum;
    private String name;
    private double rate;
    private int hours;

    public Employee() {
    }

    public Employee(String name, double rate) {
        this.name = name;
        setRate(rate);
    }

    public Employee(String name, double rate, int hours) {
        this.name = name;
        setRate(rate);
        setHours(hours);
    }

    public double getSalary() {
        return (rate * hours);
    }

    @Override
    public String toString() {
        return "Employee(" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                ", salary=" + getSalary() + ", bonuses" + getBonuses() + ')';
    }

    public double getBonuses() {
        return BONUSES * getSalary();
    }

    public static double getTotalSum() {
        return totalSum + BONUSES * totalSum;
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
        totalSum -= oldSalary;
        totalSum += newSalary;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        double oldSalary = getSalary();
        this.hours = hours;
        double newSalary = getSalary();
        totalSum -= oldSalary;
        totalSum += newSalary;
    }
}


