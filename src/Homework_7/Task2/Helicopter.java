package Homework_7.Task2;

class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxHeight;

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    @Override
    void fly() {
        System.out.println("Helicopter is flying");
    }

    @Override
    void land() {
        System.out.println("Helicopter is landing");
    }

}
