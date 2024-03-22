package denys.serdiuk.homework6OOP2.task2;

public class Boat extends WaterVehicle {
	private int volume;

	public Boat(int passengers, int volume) {
		super(passengers);
		this.volume = volume;
	}

	@Override
	public void isSailing() {
		System.out.println("This boat started sailing");

	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
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
