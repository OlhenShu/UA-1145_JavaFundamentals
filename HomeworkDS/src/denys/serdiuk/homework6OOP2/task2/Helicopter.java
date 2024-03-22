package denys.serdiuk.homework6OOP2.task2;

public class Helicopter extends FlyingVehicle {
	private int weight;
	private int maxHeight;

	public Helicopter(int passengers, int weight, int maxHeight) {
		super(passengers);
		this.maxHeight = maxHeight;
		this.weight = weight;

	}

	public void fly() {
		System.out.println("Helicopter flies");

	}

	@Override
	public void land() {
		System.out.println("Helicopter landed");

	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getMaxHeight() {
		return maxHeight;
	}

	public void setMaxHeight(int maxHeight) {
		this.maxHeight = maxHeight;
	}

	@Override
	public String toString() {
		return "Helicopter [weight=" + weight + ", maxHeight=" + maxHeight + ", passengers=" + passengers + "]";
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
