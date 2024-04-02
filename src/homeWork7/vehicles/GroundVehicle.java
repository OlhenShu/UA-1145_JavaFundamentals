package homeWork7.vehicles;

public abstract class GroundVehicle extends Passengers implements Vehicle{
    public GroundVehicle(int passengers) {
        super(passengers);
    }
    public abstract void drive();
}
