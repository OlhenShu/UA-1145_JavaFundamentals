package edu07.vehiclesystem;

public class Plane extends FlyingVehicle {
    private int maxDistance;

    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    @Override
    public void land() {
        super.land();
        System.out.print("Yes");
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Yes");
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public String getRoute() {
        return null;
    }

    @Override
    public void setRoute(String route) {

    }
}
