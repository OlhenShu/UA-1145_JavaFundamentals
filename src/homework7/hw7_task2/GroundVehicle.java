package homework7.hw7_task2;

public abstract class GroundVehicle extends Passengers implements Vehicle {
    public GroundVehicle(int passengers) {
        super(passengers);
    }

    abstract void drive();
}
