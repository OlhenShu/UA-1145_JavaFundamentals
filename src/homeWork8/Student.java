package homeWork8;

public class Student extends Person {
    private final int courseID;

    public Student(FullName fullName, int age,int courseID) {
        super(fullName, age);
        this.courseID = courseID;
    }

    @Override
    public void info() {
        System.out.println("First name: "  + fullName.getFirstName() +
                ", Last name: " + fullName.getLastName() +
                ", Age: " + age + ", courseID: " + courseID);
    }

    @Override
    public String activity() {
        return "I study at university!\n";
    }
}
