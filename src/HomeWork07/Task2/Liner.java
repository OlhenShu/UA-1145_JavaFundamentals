package HomeWork07.Task2;

public class Liner extends WaterVehicle {
    private int floors;

    public Liner(int passangers, int floors) {
        super(passangers);
        this.floors = floors;
    }

    @Override
    void isSailing() {
        System.out.println("Yes, liner can sailing");
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "Liner{" +
                "floors=" + floors +
                ", passangers=" + passangers +
                '}';
    }
}
