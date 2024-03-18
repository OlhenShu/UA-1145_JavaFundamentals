package homework.hw3.student;

import java.util.List;

public class Student {
    private String name;
    private double rating;

    public Student(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    public static Student input(List<Student> studentsList, String... values) {
        var student = new Student(values[0], Double.parseDouble(values[1]));
        studentsList.add(student);
        return student;
    }

    public static double totalRating(List<Student> studentsList) {
        if (studentsList.isEmpty()) {
            System.out.println("No students");
            return 0;
        }

        double totalRating = 0;
        for (Student student : studentsList) {
            totalRating += student.getRating();
        }
        return totalRating;
    }

    public static double avgRating(List<Student> studentList, int totalStudents) {
        return totalRating(studentList) / totalStudents;
    }

    public boolean betterStudent(Student otherStudent) {
        return this.rating > otherStudent.getRating();
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}
