package homeworks.homework_edu07.homework.Task2;

public class Liner extends WaterVehicle {
    public Liner(int passengers) {
        super(passengers);
    }

    @Override
    void isSailing() {
    }

    private int floors;

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
