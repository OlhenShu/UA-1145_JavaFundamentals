package edu08.HomeWork01;

public class Student extends Person implements Cloneable {
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String info() {
        return super.info();
    }

    @Override
    public String activity() {
        return "Studying at " + course + " course.";
    }
}
