package edu07.task02;

public class Boat extends WaterVehicle {
    private double volume;

    public Boat(int passengers, double volume) {
        super(passengers);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }


    @Override
    public void isSailing() {
        System.out.println("Yes. Boats (Sailboats) can be propelled partly or entirely by sails.");

    }
}
