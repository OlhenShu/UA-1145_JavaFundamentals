package homeWork8;

public abstract class Person implements Cloneable{
    FullName fullName;
    int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public void info(){
        System.out.println("First name: "  + fullName.getFirstName() +
                ", Last name: " + fullName.getLastName() +
                ", Age: " + age);
    }
    public abstract String activity();

    @Override
    public Person clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
