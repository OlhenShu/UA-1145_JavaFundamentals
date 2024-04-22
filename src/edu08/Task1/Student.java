package edu08.Task1;

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
    public String info() {
        return " First name " + fullName.getFirstName() + " Last name " + fullName.getLastName() + " Age " + getAge() + " Cource " + course;
    }

    @Override
    public String activity() {
        return "I'm a student!";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student cloneStudent = (Student) super.clone();
        cloneStudent.setFullName(getFullName());
        return cloneStudent;
    }
}
