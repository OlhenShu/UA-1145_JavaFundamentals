package denys.serdiuk.homework7innerClasses.task1;

public class Student extends Person {
	private int course;

	public Student(FullName fullName, int age, int course) {
		super(fullName, age);
		this.course = course;
	}

	@Override
	public String info() {
		return "Name: " + super.getFullName().getFirstName() + ", last name: " + super.getFullName().getLastName()
				+ ", age: " + super.getAge() + ", course: " + course + " ";
	}

	@Override
	public String activity() {
		return "I'm studiying at the university. ";
	}

}
