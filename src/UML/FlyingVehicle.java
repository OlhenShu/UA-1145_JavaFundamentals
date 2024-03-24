package UML;

public abstract class FlyingVehicle extends Passengers implements Vehicle{
    public FlyingVehicle(int passengers) {
        super(passengers);
    }

    abstract void fly();
    abstract void land();
}
