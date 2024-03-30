package homework7.hw7_task2;

public class Car extends GroundVehicle{
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
        System.out.println("Car is driving");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model +
                ", passengers="+getPassengers()+ '\'' +
                '}';
    }
}
