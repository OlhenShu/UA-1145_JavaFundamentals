package HomeWork07.Task2;

public class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxHeight;

    public Helicopter(int passangers, int weight, int maxHeight) {
        super(passangers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    @Override
    void fly() {
        System.out.println("Helicopter can fly");
    }

    @Override
    void land() {
        System.out.println("Helicopter land");
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "weight=" + weight +
                ", maxHeight=" + maxHeight +
                ", passengers=" + passangers +
                '}';

    }
}
