package denys.serdiuk.homework5OOP.task1;

public class NonflyingBird extends Bird {
	
	public NonflyingBird(String name, boolean feathers, boolean layEggs) {
		super(name, feathers, layEggs); 
	}
	
	@Override
	public String fly() {
		return "This bird can't fly";
	}
}
