package edu07.vehiclesystem;

public class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxHeight;

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    @Override
    public void land() {
        super.land();
        System.out.print("No");
    }

    @Override
    public void fly() {
        super.fly();
        System.out.print("Yes");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    @Override
    public String getRoute() {
        return null;
    }

    @Override
    public void setRoute(String route) {

    }
}
