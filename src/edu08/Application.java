package edu08;

public class Application {
    public static void main(String[] args) {
        Student student1 = new Student("Greg", "Alsome", 50, 3);
        Student student2 = new Student("Jane", "Jonson", 29, 4);

        System.out.println(student1.info() + "; activity: " + student1.activity());
        System.out.println(student2.info() + "; activity: " + student1.activity());
        Student cloneOfStudent;
        try {
            cloneOfStudent = (Student) student1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        cloneOfStudent.setCourse(1);
        cloneOfStudent.setFullName("Peter", "Asdfg");

        System.out.println();
        System.out.println(student1.info() + "; activity: " + student1.activity());
        System.out.println(student2.info() + "; activity: " + student1.activity());
        System.out.println(cloneOfStudent.info() + "; activity: " + student1.activity());
    }
}