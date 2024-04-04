package Homework_8;

abstract class Person {
    protected FullName fullName = new FullName();
    private int age;

    public Person(String firstName, String lastName, int age) {
        fullName.firstName = firstName;
        fullName.lastName = lastName;
        this.age = age;
    }

    public void info() {
        System.out.println("First name: " + fullName.firstName
                + ", Last name: " + fullName.lastName + ", Age: " + age);
    }

    abstract public String activity();

    public class FullName implements Cloneable {
        private String firstName;
        private String lastName;

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

}
