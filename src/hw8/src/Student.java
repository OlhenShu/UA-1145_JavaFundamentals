public class Student extends Person implements Cloneable{
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    public String info() {
        return toString();
    }

    @Override
    public String toString() {
        return "Information about object Student: \n" +
        super.toString() + "\nCourse: " + getCourse() + "\n";
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
