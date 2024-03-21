package edu07.vehiclesystem;

abstract class GroundVehicle extends Passengers implements Vehicle {
    public GroundVehicle(int passengers) {
        super(passengers);
    }

    public void drive() {
    }
}
