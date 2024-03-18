package denys.serdiuk.homework5OOP.task1;

public abstract class Bird {
	private String name; 
	private boolean feathers;
	private boolean layEggs;
	
	public Bird(String name, boolean feathers, boolean layEggs) {
		super();
		this.name = name;
		this.feathers = feathers;
		this.layEggs = layEggs;
	}

	public abstract String fly();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFeathers() {
		return feathers;
	}

	public void setFeathers(boolean feathers) {
		this.feathers = feathers;
	}

	public boolean isLayEggs() {
		return layEggs;
	}

	public void setLayEggs(boolean layEggs) {
		this.layEggs = layEggs;
	}

	@Override
	public String toString() {
		return "Bird [name=" + name + ", feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}
}
