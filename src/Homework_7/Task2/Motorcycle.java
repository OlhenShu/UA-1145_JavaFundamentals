package Homework_7.Task2;

class Motorcycle extends GroundVehicle {
    private int maxSpeed;

    public Motorcycle(int passengers) {
        super(passengers);
    }

    @Override
    void drive() {
        System.out.println("Motorcycle is driving");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
