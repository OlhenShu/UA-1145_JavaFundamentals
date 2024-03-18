package denys.serdiuk.homework5OOP.task1;

public class FlyingBird extends Bird {
	
	public FlyingBird(String name, boolean layEggs, boolean feathers) {
		super(name, feathers, layEggs);
	}
	
	@Override
	public String fly() {
		return "flying... flying... flying...";
	}
}
