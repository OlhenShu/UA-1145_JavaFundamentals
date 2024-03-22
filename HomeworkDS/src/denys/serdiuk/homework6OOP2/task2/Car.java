package denys.serdiuk.homework6OOP2.task2;

public class Car extends GroundVehicle {
	private String model;

	public Car(int passengers, String model) {
		super(passengers);
		this.model = model;
	}

	@Override
	public void drive() {
		System.out.println("Driving a car");
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", passengers=" + passengers + "]";
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
	public void isSailing() {
		// TODO Auto-generated method stub

	}

}
