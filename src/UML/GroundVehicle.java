package UML;

public abstract class GroundVehicle extends Passengers implements Vehicle{

    public GroundVehicle(int passengers) {
        super(passengers);
    }
    abstract void drive();
}
