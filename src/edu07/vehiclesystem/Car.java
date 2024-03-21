package edu07.vehiclesystem;

public class Car extends GroundVehicle {
    private String model;

    public Car(int passengers, String model) {
        super(passengers);
        this.model = model;
    }

    @Override
    public void drive() {
        super.drive();
        System.out.print("Yes");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getRoute() {
        return null;
    }

    @Override
    public void setRoute(String route) {

    }
}
