package denys.serdiuk.homework6OOP2.task2;

public class Liner extends WaterVehicle implements Vehicle {
	private int floors;

	public Liner(int passengers, int floors) {
		super(passengers);
		this.floors = floors;
	}

	@Override
	public void isSailing() {
		System.out.println("The liner started sailing");

	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub

	}

	@Override
	public void land() {
		// TODO Auto-generated method stub

	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub

	}
}
