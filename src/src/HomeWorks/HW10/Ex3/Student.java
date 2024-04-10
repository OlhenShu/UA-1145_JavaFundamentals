package HomeWorks.HW10.Ex3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Student {

    private String name;
    private int course;

    public static ArrayList<Student> studentList = new ArrayList<>();

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
        studentList.add(this);
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
