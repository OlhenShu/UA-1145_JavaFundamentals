package Practicals.Pr7.Ex2;

public class RunnerStaffAndStudent {
    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        Cleaner cleaner = new Cleaner();
        Student student = new Student();

        teacher.print();
        teacher.salary();
        cleaner.print();
        cleaner.salary();
        student.print();
    }
}
