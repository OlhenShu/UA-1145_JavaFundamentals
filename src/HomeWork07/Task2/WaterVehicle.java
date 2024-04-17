package HomeWork07.Task2;

public abstract class WaterVehicle extends Passangers implements Vehicle {

    public WaterVehicle(int passangers) {
        super(passangers);
    }

    abstract void isSailing();
}

