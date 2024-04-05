package homework8;

public class Student extends Person implements Cloneable{
    private int studentCourse;

    public Student(FullName fullName, int age, int studentCourse) {
        super(fullName, age);
        this.studentCourse = studentCourse;
    }

    public void setStudentCourse(int studentCourse) {
        this.studentCourse = studentCourse;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public String info(){
        return super.info()+" |Course: "+studentCourse;
    }

    @Override
    public String activity() {
        return "I study at university";
    }
}
