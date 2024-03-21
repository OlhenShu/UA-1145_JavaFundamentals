package edu07.vehiclesystem;

public class Liner extends WaterVehicle {

    private int floors;

    public Liner(int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }

    @Override
    public void isSailing() {
        System.out.print("Yes");
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String getRoute() {
        return null;
    }

    @Override
    public void setRoute(String route) {

    }
}
