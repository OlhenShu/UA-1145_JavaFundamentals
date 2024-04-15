package edu06.task02;

public class Developer extends Employee {

    private String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    /*  інша реалізація, з батьк. методу
    @Override
        public String report() {
            String respond = super.report() + " Position: %s; " + position;
            return respond;
        }*/
    @Override
    public String report() {
        return String.format("Name: %s, Age: %d years, Position: %s, Salary: \u20B4 %.2f",
                name, age, position, salary);
    }

}
