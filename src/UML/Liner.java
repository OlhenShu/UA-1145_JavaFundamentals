package UML;

public class Liner extends WaterVehicle{
    public int floor;

    public Liner(int passengers, int floor) {
        super(passengers);
        this.floor = floor;
    }

void isSailing(){};

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
