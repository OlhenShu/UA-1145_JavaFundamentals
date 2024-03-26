package homeworks.homework_edu07.homework.Task2;

public class Car extends GroundVehicle {
    public Car(int passengers) {
        super(passengers);
    }

    @Override
    void drive() {

    }

    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
