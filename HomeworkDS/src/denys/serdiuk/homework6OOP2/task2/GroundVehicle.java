package denys.serdiuk.homework6OOP2.task2;

public abstract class GroundVehicle extends Passengers implements Vehicle {

	public GroundVehicle(int passengers) {
		super(passengers);
	}

	public abstract void drive();

}
