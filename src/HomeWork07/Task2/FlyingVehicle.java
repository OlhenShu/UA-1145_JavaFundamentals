package HomeWork07.Task2;

public abstract class FlyingVehicle extends Passangers implements Vehicle {

    public FlyingVehicle(int passangers) {
        super(passangers);
    }

    abstract void fly();

    abstract void land();
}
