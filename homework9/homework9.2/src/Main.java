import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", "Group A", 1, List.of(5, 4, 5)));
        students.add(new Student("John", "Group B", 2, List.of(2, 2, 1)));
        students.add(new Student("Bob", "Group B", 2, List.of(3, 4, 3)));
        students.add(new Student("Charlie", "Group C", 3, List.of(5, 5, 5)));

        removeUnderperformingStudents(students);

        printStudents(students, 1);
        printStudents(students, 2);
        printStudents(students, 3);
    }

    public static void removeUnderperformingStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3.0) {
                iterator.remove();
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Students in course " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}
