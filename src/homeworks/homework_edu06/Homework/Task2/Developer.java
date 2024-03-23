package homeworks.homework_edu06.Homework.Task2;

public class Developer extends Employee {
    private String position;

    public Developer(String name, int age, double salary, String developmentFramework) {
        super(name, age, salary);
        this.position = developmentFramework;
    }

    public String getDevelopmentFramework() {
        return position;
    }

    public void setDevelopmentFramework(String developmentFramework) {
        this.position = developmentFramework;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d years, Position: %s developer" +
                ", Salary: \u20B4 %.2f.", getName(), getAge(), position, getSalary());
    }
}
