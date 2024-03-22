package denys.serdiuk.homework6OOP2.task2;

public abstract class Passengers {
	protected int passengers;

	Passengers(int passengers) {
		this.passengers = passengers;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

}
