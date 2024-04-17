package HomeWork07.Task2;

public class Motorcycle extends GroundVehicle {
    private int maxSpeed;

    public Motorcycle(int passangers, int maxSpeed) {
        super(passangers);
        this.maxSpeed = maxSpeed;
    }

    @Override
    void drive() {
        System.out.println("Motorcycle can drive");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "maxSpeed=" + maxSpeed +
                ", passangers=" + passangers +
                '}';
    }
}
