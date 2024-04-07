package edu06.Task2;

public class Developer extends Employee {

    private final String position;
    private final String language;

    public Developer(String name, int age, double salary, String position, String language) {
        super(name, age, salary);
        this.position = position;
        this.language = language;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d," +
                "Salary: \u20B4 %.2f." + " Position: %s" +
                " Language: %s", getName(), getAge(), getSalary(), position, language);


    }
}

