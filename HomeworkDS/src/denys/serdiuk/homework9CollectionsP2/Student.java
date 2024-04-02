package denys.serdiuk.homework9CollectionsP2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

public class Student implements Comparable<Student> {
	private String name;
	private int course;

	public Student(String name, int course) {
		super();
		this.name = name;
		this.course = course;
	}

	public static String printStudents(ArrayList<Student> students, int course) {
		ArrayList<Student> enrolledStudents = new ArrayList<>();
		Iterator<Student> iterator = students.iterator();

		while (iterator.hasNext()) {
			Student student = iterator.next();
			if (student.getCourse() == course) {
				enrolledStudents.add(student);
			}
		}

		return "This are the students enrolled on " + course + " course: " + enrolledStudents;
	}

	@Override
	public int compareTo(Student other) {
		int nameComparison = this.name.compareTo(other.name);
		if (nameComparison != 0) {
			return nameComparison;
		}
		return (Integer.compare(this.course, other.course));
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(course, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return course == other.course && Objects.equals(name, other.name);
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

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		Student student1 = new Student("Mike", 2);
		Student student2 = new Student("John", 1);
		Student student3 = new Student("Ann", 3);
		Student student4 = new Student("Rose", 3);

		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student3);
		students.add(student4);
		System.out.println(students);
		/*
		 * не до кінця зрозумів, як мені зробити так щоб я міг обрати по якому параметру
		 * сортувати (name чи course)?
		 */
		Collections.sort(students);

		System.out.println(students);
		System.out.println(printStudents(students, 2));

	}
}
