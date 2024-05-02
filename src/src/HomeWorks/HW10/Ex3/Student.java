package HomeWorks.HW10.Ex3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Student {

    private String name;
    private int course;

    public static ArrayList<Student> studentList = new ArrayList<>();//
    //public and static lost can be problematic in terms of data encapsulation and object-oriented design principles.

    // It's better to manage such a list externally or make it private and expose methods to manipulate or access it safely.

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
        studentList.add(this);//Adding 'this' to studentList in the constructor can lead to unexpected behaviors
    }

    public static void printStudents(int course) {
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student tmpStudent = iterator.next();
            if (tmpStudent.course == course) {
                System.out.print(tmpStudent.name + "; ");
            }
        }
        System.out.println();
    }

    public static void sortAndPrintByName() {
        ArrayList<Student> newStudentList = new ArrayList<>(studentList);
        NameComparator nameComparator = new NameComparator();
        newStudentList.sort(nameComparator);
        System.out.println(newStudentList);
    }

    public static void sortAndPrintByCourse() {
        ArrayList<Student> newStudentList = new ArrayList<>(studentList);
        CourseComparator nameComparator = new CourseComparator();
        newStudentList.sort(nameComparator);
        System.out.println(newStudentList);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public static class NameComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return (o1.name.compareTo(o2.name));
        }
    }

    public static class CourseComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return (o1.course - o2.course);
        }
    }
}
/*
 * Methods like printStudents, sortAndPrintByName, and sortAndPrintByCourse being static implies they are tied to the class rather than instances.
 * This is ok for utility functions, but if these methods are intended to work on an instance basis, make sense to consider redesigning this approach.
 * */