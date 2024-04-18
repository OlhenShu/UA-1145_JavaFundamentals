package homework9;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String group;
    private List<Double> grades;
    private int course;

    public Student(String name, String group, List<Double> grades, int course) {
        this.name = name;
        this.group = group;
        this.grades = grades;
        this.course = course;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivan", "A", List.of(2.3, 2.0, 3.5), 3));
        students.add(new Student("Volodya", "B", List.of(3.0, 2.4, 5.0), 1));
        students.add(new Student("Danylo", "B", List.of(1.5, 2.8, 3.4), 3));
        students.add(new Student("Oleg", "C", List.of(1.5, 1.8, 5.0), 2));
        System.out.println(students);
        for (Student stud : students) {
            System.out.println(stud);
            System.out.println("|-|".repeat(20));
            stud.calculateStudentGrades();
            System.out.println("|-|".repeat(20));
            stud.promoteStudent();
            System.out.println("|-|".repeat(20));
            stud.printStudents(students,stud.getCourse());
            System.out.println("|-|".repeat(20));
        }
    }
    public double calculateStudentGrades(){
        double sum =0;
        for (Double grade: this.getGrades())
            sum+=grade;
        double totalGrade=sum/ this.getGrades().size();
        System.out.printf("%.3f%n",totalGrade);
        return totalGrade;
    }
    public void promoteStudent(){
        double totalGrade = calculateStudentGrades();
        if(totalGrade>=3) {
            course++;
            System.out.println(name+" був підвищений у курсі за хороші оцінки");
        }
    }
    public void printStudents(List<Student> students, int courseNum){
        System.out.println("Студенти які є в такому "+courseNum+" курсі: ");
        boolean studentFound = false;
        for(Student stud:students) {
            if (stud.course == courseNum) {
                System.out.println(stud.getName());
                studentFound = true;
            }
        }if(!studentFound){
            System.out.println("Такого студента немає у "+courseNum+" курсі");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", grades=" + grades +
                ", course=" + course +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}
