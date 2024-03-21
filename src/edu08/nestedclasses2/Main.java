package edu08.nestedclasses2;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person(new Person.FullName("Jan Pol", "Belmondo"), 80) {
            @Override
            public String activity() {
                return null;
            }
        };
        Student student1 = new Student(new Person.FullName("Anna", "Vetrova"), 17, 2);
        Student student2 = new Student(new Person.FullName("Armen", "Shurupov"), 19, 4);
        Student student3 = (Student) student1.clone();
        student3.setCourse(5);

        System.out.println(person.info());
        System.out.println("-----------------------------------------");
        System.out.println(student1.info());
        System.out.println(student1.activity());
        System.out.println("-----------------------------------------");
        System.out.println(student2.info());
        System.out.println(student2.activity());
        System.out.println("-----------------------------------------");
        System.out.println(student3.info());
        System.out.println(student3.activity());


    }
}