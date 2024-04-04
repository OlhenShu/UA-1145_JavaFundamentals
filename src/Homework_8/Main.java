package Homework_8;

public class Main implements Cloneable {
    public static void main(String[] args) {
        Student student1 = new Student("Iegor", "Ivanov", 21, 4);
        Student student2 = new Student("Maria", "Zaichenko", 19, 2);

        student1.info();
        System.out.println(student1.activity());
        System.out.println();

        student2.info();
        System.out.println(student2.activity());
        System.out.println();

        Student clonedStudent;

        try {
            clonedStudent = (Student) student1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException();
        }

        clonedStudent.setCourseNumber(5);

        System.out.println("First student: ");
        student1.info();
        System.out.println("\nCloned student: ");
        clonedStudent.info();
    }
}
