package homeWork10;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Student  {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    //Why do you use second parameter int course? Student has it in constructor
    void printStudent(LinkedList<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println("Student " + student.getName() + " enrolled in the course " + course);
            }
        }
    }

    public static class ComparatorByName implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
    public static class ComparatorByCourse implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return Integer.compare(o1.getCourse(),o2.getCourse());
        }
    }

     void printAllStudents(List<Student> list) {
        for (Student student : list) {
            System.out.println(student.getName() + "    " + student.getCourse());
        }
    }
}

class RunStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Bob", 1);
        Student student2 = new Student("John", 2);
        Student student3 = new Student("Stacy", 1);
        Student student4 = new Student("Jasmine", 2);
        Student student5 = new Student("Sam", 1);

        LinkedList<Student> students = new LinkedList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);


        Student st = new Student();
        System.out.println("Show all students enrolled in the course 2");
        st.printStudent(students, 2);
        st.printAllStudents(students);
        students.sort(new Student.ComparatorByCourse());
        System.out.println("Compared by course.");
        st.printAllStudents(students);
        students.sort(new Student.ComparatorByName());
        System.out.println("Compared by name.");
        st.printAllStudents(students);

    }

}
