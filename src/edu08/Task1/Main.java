package edu08.Task1;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        FullName student1FullName = new FullName("John", "Brown");
        Student student1 = new Student(student1FullName, 22, 5);
        FullName student2FullName = new FullName("Bob", "Johns");
        Student student2 = new Student(student2FullName, 20, 3);
        System.out.println(student1.info());
        System.out.println(student1.activity());
        System.out.println(student2.info());

        Student student3 = (Student) student1.clone();
        System.out.println(student3.info());
        student3.setCourse(1);
        System.out.println(student3.info());

    }
}
