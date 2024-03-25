package edu07.HomeWork02;

public class Liner extends WaterVehicle {
    private int floors;

    public Liner(int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    void isSailing() {
        System.out.println("The liner is sailing into an ocean");
    }

    @Override
    public String toString() {
        return "Liner{" +
                "floors=" + floors +
                ", passengers=" + passengers +
                '}';
    }
}
