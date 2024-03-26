package homework6.hw6_task2;

public class Developer extends Employee{
    String phrase;

    public Developer(String name, int age, double salary, String phrase) {
        super(name, age, salary);
        this.phrase = phrase;
    }
    @Override
    public String report(){
        return ("Ім'я: " + getName() + ", Вік: "
                + getAge() + " років."+ " Зарплата: " + getSalary()+ " Улюблена фраза: "
                + phrase);
    }
}
