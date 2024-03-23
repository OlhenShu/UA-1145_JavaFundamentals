public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student(new FullName("Jack", "Brown"), 18, 2);
        Student student2 = new Student(new FullName("Alice", "Green"), 17, 1);
        System.out.println(student1.info());
        System.out.println(student2.info());
        System.out.println(student1.activity());
        System.out.println(student2.activity());
        Student student3 = (Student) student1.clone();
        System.out.println("-".repeat(40));
        System.out.println(student3.info());
        student3.setCourse(3);
        System.out.println(student3.info());
        System.out.println(student3.activity());

    }
}
