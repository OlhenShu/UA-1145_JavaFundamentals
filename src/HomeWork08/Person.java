package HomeWork08;


public abstract class Person {
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String info() {
        return "Name: : " + fullName.getFirstName() +
                ", LastName: : " + fullName.getLastName() +
                ", Age: " + age + " :";
    }

    public abstract String activity();

}

