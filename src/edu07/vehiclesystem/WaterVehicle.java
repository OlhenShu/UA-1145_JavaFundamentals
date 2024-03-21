package edu07.vehiclesystem;

abstract class WaterVehicle extends Passengers implements Vehicle {
    public WaterVehicle(int passengers) {
        super(passengers);
    }

    public void isSailing() {
    }
}
