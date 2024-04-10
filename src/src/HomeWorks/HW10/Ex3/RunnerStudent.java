package HomeWorks.HW10.Ex3;

public class RunnerStudent {

    public static void main(String[] args) {

        Student s1 = new Student("Ann", 3);
        Student s2 = new Student("Den", 1);
        Student s3 = new Student("Kate", 1);
        Student s4 = new Student("Sara", 2);
        Student s5 = new Student("Alex", 3);

        Student.printStudents(3);


        Student.sortAndPrintByName();
        Student.sortAndPrintByCourse();
    }
}
