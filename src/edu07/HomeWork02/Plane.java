package edu07.HomeWork02;

public class Plane extends FlyingVehicle {
    private int maxDistance;

    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    void fly() {
        System.out.println("The plain is flying high.");

    }

    @Override
    void land() {
        System.out.println("The plane lands.");

    }

    @Override
    public String toString() {
        return "Plane{" +
                "maxDistance=" + maxDistance +
                ", passengers=" + passengers +
                '}';
    }
}
