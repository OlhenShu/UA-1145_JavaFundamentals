package homework7.hw7_task2;

public abstract class FlyingVehicle extends Passengers implements Vehicle {
    public FlyingVehicle(int passengers) {
        super(passengers);
    }

    abstract void fly();
    abstract void land();
}
