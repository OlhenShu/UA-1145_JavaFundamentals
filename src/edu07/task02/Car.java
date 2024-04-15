package edu07.task02;

public class Car extends GroundVehicle {
    private String model;

    public Car(int passengers, String model) {
        super(passengers);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("To drive a car, you need driver's licence, and you must to be at least 16-18" +
                " years old (varies between states).");

    }
}
