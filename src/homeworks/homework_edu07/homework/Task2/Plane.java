package homeworks.homework_edu07.homework.Task2;

public class Plane extends FlyingVehicle {
    public Plane(int passengers) {
        super(passengers);
    }

    @Override
    void fly() {

    }

    @Override
    void land() {

    }

    private int maxDistance;

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
