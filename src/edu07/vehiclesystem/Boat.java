package edu07.vehiclesystem;

public class Boat extends WaterVehicle {
    private int volume;

    public Boat(int passengers, int volume) {
        super(passengers);
        this.volume = volume;
    }

    @Override
    public void isSailing() {
        super.isSailing();
        System.out.print("Yes");
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String getRoute() {
        return null;
    }

    @Override
    public void setRoute(String route) {

    }
}
