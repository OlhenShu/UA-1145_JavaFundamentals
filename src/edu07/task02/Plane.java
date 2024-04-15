package edu07.task02;

public class Plane extends FlyingVehicle {
    private int maxDistance;

    public Plane(int passengers, int maxDistance) {
        super(passengers);

        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        System.out.println("Plane can fly very long distances, but when changing direction, it requires maneuvering.");
    }

    @Override
    public void land() {
        System.out.println("To land, a plane requires a long runway. ");

    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
