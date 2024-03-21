package edu08.nestedclasses;

public class Student extends Person implements Cloneable {
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    public String info() {
        return "Course: " + this.getCourse() + "\n" + super.info();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
