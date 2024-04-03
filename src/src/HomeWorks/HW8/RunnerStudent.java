package HomeWorks.HW8;

public class RunnerStudent {
    public static void main(String[] args) {
        Student student = new Student("John", "Doe", 20, 3);
        student.info();
        System.out.println(student.activity());
        Student student2 = new Student("Jane", "Smith", 25, 2);
        student2.info();
        System.out.println(student2.activity());

        Student copyOfStudent = student.clone();
        copyOfStudent.info();

        System.out.println("==============================");

        copyOfStudent.setCourse(4);
        copyOfStudent.getFullName().setFirstName("Kate");
        copyOfStudent.getFullName().setLastName("Black");
        copyOfStudent.setAge(30);

        student.info();
        student2.info();
        copyOfStudent.info();
    }
}
