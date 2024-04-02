package homeWork7.vehicles;

public class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxWeight;

    public Helicopter(int passengers) {
        super(passengers);
    }

    @Override
    public void fly() {
        System.out.println("Helicopter is flying.");
    }

    @Override
    public void land() {
        System.out.println("Helicopter is not flying.");
    }
}
