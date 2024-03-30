package HomeWorks.HW7.Ex2;

public class Car extends GroundVehicle {

    private String model;

    public Car(int passengers, String model) {
        super(passengers);
        this.model = model;
    }


    @Override
    public void drive() {
        System.out.println("Car is driving");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
