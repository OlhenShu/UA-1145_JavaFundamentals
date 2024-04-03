package Homework_7.Task2;

class Plane extends FlyingVehicle {
    private int maxDistance;

    public Plane(int passengers) {
        super(passengers);
    }

    @Override
    void fly() {
        System.out.println("Plane is flying");
    }

    @Override
    void land() {
        System.out.println("Plane is landing");
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
