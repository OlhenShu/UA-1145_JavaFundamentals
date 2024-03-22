package denys.serdiuk.homework6OOP2.task2;

public abstract class FlyingVehicle extends Passengers implements Vehicle {

	FlyingVehicle(int passengers) {
		super(passengers);
	}

	public abstract void fly();

	public abstract void land();

}
