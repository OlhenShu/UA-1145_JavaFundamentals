package HomeWork07.Task2;

public abstract class GroundVehicle extends Passangers implements Vehicle {

    public GroundVehicle(int passangers) {
        super(passangers);
    }

    abstract void drive();
}
