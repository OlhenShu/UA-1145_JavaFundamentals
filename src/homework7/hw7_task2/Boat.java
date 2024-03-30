package homework7.hw7_task2;

public class Boat extends WaterVehicle{
    private int volume;

    public Boat(int passengers, int volume) {
        super(passengers);
        this.volume = volume;
    }

    @Override
    void isSailing() {
        System.out.println("Boat is sailing");
    }

    @Override
    public String toString() {
        return "Boat{" +
                "volume=" + volume +
                ", passengers" + getPassengers() +
                '}';
    }
}
