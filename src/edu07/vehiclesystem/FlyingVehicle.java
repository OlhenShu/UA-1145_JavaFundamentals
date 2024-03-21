package edu07.vehiclesystem;

public abstract class FlyingVehicle extends Passengers implements Vehicle {
    public FlyingVehicle(int passengers) {
        super(passengers);
    }

    public void fly() {
    }

    public void land() {
    }
}
