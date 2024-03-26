package denys.serdiuk.homework7innerClasses;

public class Homework7Main {

	public static void main(String[] args) {
		Person student1 = new Student(new FullName("Dave", "Jones"), 58, 2);
		Person student2 = new Student(new FullName("Denys", "Serdiuk"), 24, 4);
		System.out.println("student1: " + student1.activity() + student1.info());
		System.out.println("student2: " + student2.activity() + student2.info());

	}

}
