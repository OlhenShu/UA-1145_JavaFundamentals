package HomeWork08;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student(new FullName("Vitalik", "Kalmar"), 17, 5);
        Student student2 = new Student(new FullName("Ivan", "yapp"), 19, 4);

        Student student3 = (Student) student1.clone();
        student3.setCourse(2);
        Student student4 = (Student) student2.clone();
        student4.setCourse(1);

        System.out.println(student1.info());
        System.out.println(student1.activity());
        System.out.println();
        System.out.println(student2.info());
        System.out.println(student2.activity());
        System.out.println();
        System.out.println(student3.info());
        System.out.println(student3.activity());
        System.out.println();
        System.out.println(student4.info());
        System.out.println(student4.activity());
    }

}
