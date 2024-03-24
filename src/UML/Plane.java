package UML;

public class Plane extends FlyingVehicle{
    public int maxDistance;

    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    @Override
    void fly() {

    }

    @Override
    void land() {

    }
}
