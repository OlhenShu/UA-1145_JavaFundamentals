package HM6;

class startProject {
    public static void main(String[] args) {
        Employee sam = new Employee("Sam", 30, 2300);
        Developer tom = new Developer("Tom", 23, 2300, "Analyst");
        System.out.println(sam.report() + "\n" + tom.report());
    }
}

public class Employee {
    private final String name;
    private final int age;
    private final double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String report() {
        return String.format("Name: %s, Age; %d " + "Salary: ₴ %.2f", name, age, salary);
    }
}

class Developer extends Employee {
    private final String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
        return String.format("%s, Position: %s", super.report(), position);
    }
}

