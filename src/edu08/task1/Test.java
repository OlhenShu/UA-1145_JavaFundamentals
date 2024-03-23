package edu08.task1;

class FullName {
    String firstName;
    String lastName;

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

abstract class Person {
    private final FullName fullName;
    private final int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String info() {
        return "First name: " + fullName.getFirstName()
                + " Last name: " + fullName.getLastName()
                + " Age: " + age;
    }

    public abstract String activity();
}
