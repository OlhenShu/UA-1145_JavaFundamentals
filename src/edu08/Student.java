package edu08;

public class Student extends Person implements Cloneable {
    private int course;

    public Student(String firstName, String lastName, int age, int course) {
        super(firstName, lastName, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student copyOfStudent = (Student) super.clone();

        return copyOfStudent;
    }

    @Override
    public String info() {

        String studentCourse = " Course: " + course;
        return super.info() + studentCourse;
    }

    @Override
    public String activity() {
        return "I am studying at university";
    }
}

