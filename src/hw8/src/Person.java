public abstract class Person {
    private int age;
    private FullName fullName;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    @Override
    public String toString() {
        return fullName +"\nAge: " + age;
    }

    public String info() {
        return toString();
    }

    public abstract String activity();
}