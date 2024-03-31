package edu08.HomeWork01;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student(new FullName("Jashtone", "Pill"), 20, 1);
        Student student2 = new Student(new FullName("Kalev", "Kallo"), 22, 3);

        //Create one more instance of Student class by cloning the first student, change a course
        //for this object and output full information about created students.
        Student student3 = (Student) student1.clone();
        student3.setCourse(2);
        Student student4 = (Student) student2.clone();
        student4.setCourse(4);

        System.out.println(student1.info() + " " + student1.activity());
        System.out.println("=".repeat(40));
        System.out.println(student2.info() + " " + student2.activity());
        System.out.println("=".repeat(40));
        System.out.println(student3.info() + " " + student3.activity());
        System.out.println("=".repeat(40));
        System.out.println(student4.info() + " " + student4.activity());

    }
}
