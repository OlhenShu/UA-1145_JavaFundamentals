package homeworks.homework_edu07.homework.Task2;

public class Boat extends WaterVehicle {
    public Boat(int passengers) {
        super(passengers);
    }

    @Override
    void isSailing() {

    }

    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
