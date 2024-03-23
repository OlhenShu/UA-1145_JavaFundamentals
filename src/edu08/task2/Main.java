package edu08.task2;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Bob", 1);
        Student student2 = new Student("Alice", 2);


        System.out.println("Info about student 1:");
        student1.info();
        System.out.println("Activity: " + student1.activity());
        System.out.println();

        System.out.println("Info about student 2:");
        student2.info();
        System.out.println("Activity: " + student2.activity());
        System.out.println();

        try {

            Student clonedStudent = (Student) student1.clone();
            clonedStudent.setCourse(3);


            System.out.println("Info about cloned student:");
            clonedStudent.info();
            System.out.println("Activity: " + clonedStudent.activity());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

class Person implements Cloneable {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String activity() {
        return "I am not study at university";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Student extends Person {
    private int course;

    public Student(String name, int course) {
        super(name);
        this.course = course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    public void info() {
        System.out.println("Name: " + getName() + ", Course: " + course);
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}


