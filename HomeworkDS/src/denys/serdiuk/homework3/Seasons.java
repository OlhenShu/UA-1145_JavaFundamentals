package denys.serdiuk.homework3;

public enum Seasons {
	AUTUMN("Autumn", 0),
	WINTER("Winter", 0),
	SPRING("Spring", 0),
	SUMMER("Summer", 0);
	
	private final String name;
	private int numStudents;
	
	Seasons(String name, int numStudents){
		this.name = name;
		this.numStudents = numStudents;
	}
	public void setNumStudents(int numStudents) {
		this.numStudents = numStudents;
	}
	public int getNumStudents() {
		return numStudents;
	}
	public String getName() {
		return name;
	}
	
}
