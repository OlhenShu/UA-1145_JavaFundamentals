package edu03;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    public Student(){

    }
    public Student(String firstName){
        this.firstName = firstName;
    }

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public boolean passExam(String subject){

        return true;
    }
    public void print(){
        System.out.println("I am student");
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


class Example {


    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Alice");
        Student student3 = new Student("Inna", "Dancer", 45);
        Student student4 = new Student("Anna", "Peterson", 33);
        student3.print();
        student4.print();
//        System.out.println(student2.passExam("Math"));
//        System.out.println(student2);
        System.out.println(student4);
        student3.setAge(30);
        System.out.println(student3);;

    }





}
