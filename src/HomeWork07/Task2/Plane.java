package HomeWork07.Task2;

public class Plane extends FlyingVehicle {
    private int maxDistance;

    public Plane(int passangers, int maxDistance) {
        super(passangers);
        this.maxDistance = maxDistance;
    }

    @Override
    void fly() {
        System.out.println("Yes, plane can fly");
    }

    @Override
    void land() {
        System.out.println("Plane lands");
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "maxDistance=" + maxDistance +
                ", passangers=" + passangers +
                '}';
    }
}


