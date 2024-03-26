package homeworks.homework_edu07.homework.Task2;

public class Motorcycle extends GroundVehicle {
    public Motorcycle(int passengers) {
        super(passengers);
    }

    @Override
    void drive() {

    }

    private int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
