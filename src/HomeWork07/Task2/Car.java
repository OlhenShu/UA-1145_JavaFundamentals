package HomeWork07.Task2;

public class Car extends GroundVehicle {
    private String model;

    public Car(int passangers, String model) {
        super(passangers);
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
        System.out.println("Car can drive");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", passangers=" + passangers +
                '}';
    }
}
