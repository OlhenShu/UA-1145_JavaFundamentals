package HomeWork06.Task2;

public class Developer extends Employee{
    String quote;

    public Developer(String name, int age, double salary, String quote) {
        super(name, age, salary);
        this.quote = quote;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d, " +
                "Salary: \u20B4 %.2f Favorite quote: %s." , name, age, salary, quote);
    }
}
