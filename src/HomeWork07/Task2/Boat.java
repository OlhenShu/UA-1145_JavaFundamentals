package HomeWork07.Task2;

public class Boat extends WaterVehicle {
    private int volume;

    public Boat(int passangers, int volume) {
        super(passangers);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    void isSailing() {
        System.out.println("Yes, boat can sailing");
    }

    @Override
    public String toString() {
        return "Boat{" +
                "volume=" + volume +
                ", passangers=" + passangers +
                '}';
    }
}
