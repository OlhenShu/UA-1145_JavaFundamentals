package denys.serdiuk.homework6OOP2.task2;

public class Plane extends FlyingVehicle {
	private int maxDistance;

	public Plane(int passengers, int maxDistance) {
		super(passengers);
		this.maxDistance = maxDistance;

	}

	@Override
	public void fly() {
		System.out.println("Fly");

	}

	@Override
	public void land() {
		System.out.println("Land");

	}

	public int getMaxDistance() {
		return maxDistance;
	}

	public void setMaxDistance(int maxDistance) {
		this.maxDistance = maxDistance;
	}

	@Override
	public void isSailing() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}

}
