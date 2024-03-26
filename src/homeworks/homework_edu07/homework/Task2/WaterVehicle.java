package homeworks.homework_edu07.homework.Task2;

public abstract class WaterVehicle extends Passengers implements Vehicle {


    public WaterVehicle(int passengers) {
        super(passengers);
    }

    abstract void isSailing();


}
