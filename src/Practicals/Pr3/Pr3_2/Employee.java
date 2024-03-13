package Practicals;

public class Employee {
    private String name;
    private int rate;
    private int hours;

    public static int totalSum;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public static int getTotalSum() {
        return totalSum;
    }

    public static double getSalary(int rate, int hours) {
        return (rate * hours);
    }

    public static double getBonuses(int rate, int hours) {
        return (rate * hours * 0.1);
    }

    public static double getTotalSum (double salary, double bonuses){
        return (salary + bonuses);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

}
