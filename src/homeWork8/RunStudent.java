package homeWork8;

class RunStudent {
    public static void main(String[] args) {

        Student student1 = new Student(new FullName("John","Doe"),35,12345);
        Student student2 = new Student(new FullName("Sam","Smith"),25,54321);

        student1.info();
        System.out.println(student1.activity());

        student2.info();
        System.out.println(student2.activity());

        Student student3 = (Student) student1.clone();

        student3.info();
        System.out.println(student3.activity());

    }
}
