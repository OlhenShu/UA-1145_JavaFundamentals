//• Create one more instance of Student class by cloning the first student, change a course
//for this object and output full information about created students.
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(new FullName("John", "Doe"), 20, 1);
        Student student2 = new Student(new FullName("Alice", "Smith"), 21, 2);
        System.out.println("Student 1 Info: " + student1.info());
        System.out.println("Student 1 Activity: " + student1.activity());

        System.out.println("Student 2 Info: " + student2.info());
        System.out.println("Student 2 Activity: " + student2.activity());
    }
}