package denys.serdiuk.homework6OOP2.task2;

public abstract class WaterVehicle extends Passengers implements Vehicle{

	WaterVehicle(int passengers) {
		super(passengers);
	}

	public abstract void isSailing();

}
