package Task2;

public class Plane extends FlyingVehicle{
    private int maxDistance;
    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        System.out.println("This plane started flying successfully!");
    }

    @Override
    public void land() {
        System.out.println("This plain landed successfully!");
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
