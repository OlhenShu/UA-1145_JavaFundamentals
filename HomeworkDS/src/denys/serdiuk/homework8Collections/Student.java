package denys.serdiuk.homework8Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {
	private String name;
	private int group;
	private int course;
	private double avgGrade;

	public Student(String name, int group, int course, double avgGrade) {
		super();
		this.name = name;
		this.group = group;
		this.course = course;
		this.avgGrade = avgGrade;
	}

	public static void removeLosers(ArrayList<Student> students) {
		Iterator<Student> iterator = students.iterator();

		while (iterator.hasNext()) {
			Student student = iterator.next();
			if (student.getAvgGrade() <= 3.0) {
				iterator.remove();
			} else {
				student.setCourse(student.getCourse() + 1);
			}
		}
	}

	public static String printStudents(ArrayList<Student> students, int course) {
		StringBuilder s = new StringBuilder();

		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).course == course) {
				s.append(students.get(i).getName());
				s.append(' ');
			}
		}
		return "Students of the " + course + " course: " + s.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public double getAvgGrade() {
		return avgGrade;
	}

	public void setAvgGrade(double avgGrade) {
		this.avgGrade = avgGrade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", group=" + group + ", course=" + course + ", avgGrade=" + avgGrade + "]";
	}

	public static void main(String[] args) {
		Student student1 = new Student("Den", 1, 3, 3.65);
		Student student2 = new Student("Oleg", 4, 3, 2.55);
		Student student3 = new Student("Anna", 2, 1, 4.56);
		Student student4 = new Student("Oksana", 1, 3, 3.99);
		Student student5 = new Student("Jack", 2, 2, 2.26);

		ArrayList<Student> students = new ArrayList<>();

		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);

		System.out.println(printStudents(students, 3));

		removeLosers(students);

		System.out.println(students.toString());
	}

}
