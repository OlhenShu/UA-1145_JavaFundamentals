package denys.serdiuk.homework6OOP2.task2;

public class Motorcycle extends GroundVehicle {
	private int maxSpeed;

	public Motorcycle(int passengers, int maxSpeed) {
		super(passengers);
		this.maxSpeed = maxSpeed;
	}

	@Override
	public void drive() {
		System.out.println("Driving a motorcycle");

	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Motorcycle [maxSpeed=" + maxSpeed + ", passengers=" + passengers + "]";
	}

	@Override
	public void fly() {
		// Not used
		
	}

	@Override
	public void land() {
		// Not used
		
	}

	@Override
	public void isSailing() {
		// Not used
		
	}

}
