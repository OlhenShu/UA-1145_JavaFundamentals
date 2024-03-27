package UML;

public class Motocycle extends GroundVehicle{
    public int maxSpeed;

    public Motocycle(int passengers, int maxSpeed) {
        super(passengers);
        this.maxSpeed = maxSpeed;
    }

    @Override
    void drive() {

    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
