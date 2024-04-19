public class Main {
    public static void main(String[] args) {
        FullName fullName1 = new FullName("Alice", "Smith");
        Student student1 = new Student(fullName1, 20, 1);

        FullName fullName2 = new FullName("Bob", "Johnson");
        Student student2 = new Student(fullName2, 22, 3);

        System.out.println("Student 1:");
        System.out.println(student1.info());
        System.out.println(student1.activity());

        System.out.println("\nStudent 2:");
        System.out.println(student2.info());
        System.out.println(student2.activity());

        // Cloning student1
        Student student3 = student1.clone();
        student3.setCourse(2);

        System.out.println("\nCloned Student 1:");
        System.out.println(student1.info());
        System.out.println(student1.activity());
        System.out.println(student3.info());
        System.out.println(student3.activity());
    }
}