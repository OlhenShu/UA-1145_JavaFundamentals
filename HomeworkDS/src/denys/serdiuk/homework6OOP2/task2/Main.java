package denys.serdiuk.homework6OOP2.task2;

public class Main {

	public static void main(String[] args) {
		
		GroundVehicle tesla = new Car(4, "Tesla");
		System.out.println(tesla.toString());
		
		FlyingVehicle helic = new Helicopter(6, 700, 205);
		System.out.println(helic.toString());
		helic.fly();
		
		WaterVehicle boat = new Liner (400, 2);
		System.out.println(boat.toString());
		boat.isSailing();
	}

}
