package homework7.hw7_task2;

public class Helicopter extends FlyingVehicle{
    private int weight;
    private int maxHeight;

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
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

    @Override
    public String toString() {
        return "Helicopter{" +
                "weight=" + weight +
                ", maxHeight=" + maxHeight +
                ", passengers="+getPassengers()+
                '}';
    }
}
