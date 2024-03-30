package homework7.hw7_task2;

public class Motorcycle extends GroundVehicle{
    private int maxSpeed;

    public Motorcycle(int passengers, int maxSpeed) {
        super(passengers);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    void drive() {
        System.out.println("Motorcycle is driving");
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "maxSpeed=" + maxSpeed +
                ", passengers="+ getPassengers()+
                '}';
    }
}
