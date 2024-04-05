package HomeWorks.HW9.Ex2;

public class RunnerStudent {
    public static void main(String[] args) {

        Student student1 = new Student("Alice", "AA", 3);
        Student student2 = new Student("Bob", "AF", 1);
        Student student3 = new Student("Kate", "KK", 2);
        Student student4 = new Student("Bill", "KK", 4);
        Student student5 = new Student("Ann", "NN", 1);
        Student student6 = new Student("John", "AA", 2);

        student1.findAveragePoint(5, 3, 4);
        student2.findAveragePoint(2, 2, 3);
        student3.findAveragePoint(5, 3, 4);
        student4.findAveragePoint(3, 5, 5);
        student5.findAveragePoint(1, 3, 3);
        student6.findAveragePoint(4, 4, 4);
        System.out.println();

        Student.goExam();

        System.out.println();
        System.out.println(Student.studentList);

        Student.findOnCourse(3);
    }
}
