package Homework_8;

public class Student extends Person implements Cloneable {
    private int courseNumber;

    public Student(String firstName, String lastName, int age, int courseNumber) {
        super(firstName, lastName, age);
        this.courseNumber = courseNumber;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Course: " + courseNumber);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student copyOfStudent = (Student) super.clone();
        copyOfStudent.fullName = (FullName)copyOfStudent.fullName.clone();
        return copyOfStudent;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }
}
