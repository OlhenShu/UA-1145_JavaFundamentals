package edu07.task02;

public class Motorcycle extends GroundVehicle {

    private int maxSpeed;

    public Motorcycle(int passengers, int maxSpeed) {
        super(passengers);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        System.out.println("To drive a motorcycle, you need a motorcycle license or endorsement" +
                " and at least 16 years old, before you start learning to ride a motorcycle.");
    }
}
