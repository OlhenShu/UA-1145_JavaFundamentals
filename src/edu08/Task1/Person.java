package edu08.Task1;

public abstract class Person {
    private final int age;
    FullName fullName;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public String info() {
        return "First name" + fullName.getFirstName() + "Last name" + fullName.getLastName() + age;
    }

    public abstract String activity();

}
