package HomeWorks.HW8;

public abstract class Person implements Cloneable {
    private FullName fullName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.fullName = new FullName(firstName, lastName);
        this.age = age;
    }

    public void info() {
        System.out.println("First name: " + fullName.getFirstName() + ", Last name: " + fullName.getLastName() + ", Age: " + age);
    }

    public abstract String activity();

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        Person clonedPerson = (Person) super.clone();
        clonedPerson.fullName = (FullName) this.fullName.clone();
        return clonedPerson;
    }
}
