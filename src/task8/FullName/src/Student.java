public class Student extends Person{
    int Course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        Course = course;
    }

    @Override
    public String activity() {
        return null;
    }

    public String info(){
    return  super.info() + " I study at university";
    }
}
