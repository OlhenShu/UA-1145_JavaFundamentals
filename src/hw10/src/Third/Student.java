package Third;

import java.util.*;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public static void printStudents(List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
        boolean isFind = false;
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                isFind = true;
                System.out.println(student.getName() + " enrolled in course " + course);
            }
        } if(!isFind) {
            System.out.println("There is no students enrolled in this course");
        }
    }

    public static List<Student> sortByName(List<Student> students) {
        System.out.println(" " + "\nSorting by name: ");
        List<Student> listSortedByName = new ArrayList<>(students);
        listSortedByName.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // if names aren`t same, we will sort this list by name
                if(o1.getName().compareTo(o2.getName()) != 0) {
                    return o1.getName().compareTo(o2.getName());
                }
                else {
                    // if names are the same, we will sort this list by number of course
                    return o1.getCourse() - o2.getCourse();
                }
            }
        });
        return listSortedByName;
    }

    public static List<Student> sortByCourse(List<Student> students){
        System.out.println(" " + "\nSorting by course: ");
        List<Student> listSortedByCourse = new ArrayList<>(students);
        listSortedByCourse.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // if numbers of course aren`t same, we will sort this list by number of course
                if(o1.getCourse() - o2.getCourse() != 0){
                    return o1.getCourse() - o2.getCourse();
                } else{
                    // if numbers of course are the same, we will sort this list by name
                    return o1.getName().compareTo(o2.getName());
                }
            }
        });
        return listSortedByCourse;
    }

    @Override
    public String toString() {
        return "\nInformation about student: " +
                "\nName: " + name +
                "\nCourse in which student is enrolled: " + course;
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
}
