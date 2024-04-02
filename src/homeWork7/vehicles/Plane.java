package homeWork7.vehicles;

public class Plane extends FlyingVehicle {
    private int maxDistance;

    public Plane(int passengers) {
        super(passengers);
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        System.out.println("Plane is flying.");
    }

    @Override
    public void land() {
        System.out.println("Plane is not flying.");
    }
}
