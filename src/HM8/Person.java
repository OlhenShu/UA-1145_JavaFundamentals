package HM8;

public abstract class Person {
    FullName fullName;
    int age;

    public Person(FullName fullName, int age) {
        this.age = age;
        this.fullName = fullName;
    }

    public String info() {
        return "First name: " + this.fullName.getFirstName() +
                "\n Last name: " + this.fullName.getLastName()
                + "\n Age: " + this.getAge();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract String activity();
}
