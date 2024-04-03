package Homework_7.Task2;

class Car extends GroundVehicle {
    private String model;

    public Car(int passengers) {
        super(passengers);
    }

    @Override
    void drive() {
        System.out.println("Car is driving");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
