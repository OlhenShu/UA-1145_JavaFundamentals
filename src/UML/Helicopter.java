package UML;

public class Helicopter extends FlyingVehicle{
    public int weight;
    public int maxHeight;

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    @Override
    void fly() {

    }

    @Override
    void land() {

    }
}
