package denys.serdiuk.homework.week2;

import java.util.Scanner;

public class Person {

	private String firstName;

	private String lastName;

	private int birthYear;

	// 2 constructors

	public Person(String firstName, String lastName, int birthYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
	}

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// Methods
	public int getAge() {
		return 2024 - birthYear;
	}

	public void input() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("First Name: ");
		setLastName(scanner.next());

		System.out.println("Last Name: ");
		setFirstName(scanner.next());

		System.out.println("Birth year: ");
		setBirthYear(scanner.nextInt());

		scanner.close();//don't close scanner here
	}

	public String output() {
		return "First name is: " + getFirstName() + "\nLast name is: " + getLastName() + "\nThe birth year is: "
				+ getBirthYear();
	}

	public void changeName(String fn, String ln) {
		setFirstName(fn);
		setLastName(ln);
	}

	// getters and setters

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", birthYear=" + birthYear + "]";
	}

	public static void main(String[] args) {
		Person person1 = new Person("Denys", "Serdiuk", 2000);
		System.out.println(person1.getAge());

		Person person2 = new Person("Carl", "Deck");
		person2.changeName("John", "Smith");

		Person person3 = new Person("Test", "NotAName");
		person3.input();
		System.out.println(person3.toString());

		Person person4 = new Person("Mike", "Smith");
		person4.output();

		Person person5 = new Person("Dave", "Brook");
		person5.setBirthYear(1995);
		person5.output();
	}
}
