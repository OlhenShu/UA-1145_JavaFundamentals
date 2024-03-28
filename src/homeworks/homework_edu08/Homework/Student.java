package homeworks.homework_edu08.Homework;

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
        return "I am a student.";
    }

    @Override
    public String info() {
        return super.info() + ", Course: " + course;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student  studentClone = (Student)  super.clone();
        studentClone.setFullName(new FullName(getFullName().getFirstName(), getFullName().getLastName()));
        return studentClone;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        FullName student1FullName = new FullName("Anna", "Jon");
        FullName student2FullName = new FullName("Bob", "Smith");

        Student student1 = new Student(student1FullName, 19, 2);
        Student student2 = new Student(student2FullName, 21, 4);

        System.out.println("Information about student 1: " + student1.info());
        System.out.println("Activity student 1: " + student1.activity());

        System.out.println("Information about student 2: " + student2.info());
        System.out.println("Activity student 2: " + student2.activity());

        Student student3 = null;
        try {
            student3 = (Student) student1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        if (student3 != null) {
            student3.setCourse(3);
        }

        System.out.println("Information about student 3: " + student3.info());
        System.out.println("Activity student 3: " + student3.activity());


    }


}
