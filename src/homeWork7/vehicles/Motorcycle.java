package homeWork7.vehicles;

public class Motorcycle extends GroundVehicle {
    private int maxSpeed;

    public Motorcycle(int passengers) {
        super(passengers);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        System.out.println("Test text for Motorcycle > drive method.");
    }
}
