package edu07.HomeWork02;

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
    void drive() {
        System.out.println("The car goes vroom-vroom!");

    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", passengers=" + passengers +
                '}';
    }
}
