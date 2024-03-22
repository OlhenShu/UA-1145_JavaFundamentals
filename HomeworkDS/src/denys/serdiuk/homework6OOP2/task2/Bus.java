package denys.serdiuk.homework6OOP2.task2;

public class Bus extends GroundVehicle {
	private String route;

	public Bus(int passengers, String route) {
		super(passengers);
		this.route = route;
	}

	@Override
	public void drive() {
		System.out.println("Driving a bus");
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	@Override
	public String toString() {
		return "Bus [route=" + route + ", passengers=" + passengers + "]";
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
