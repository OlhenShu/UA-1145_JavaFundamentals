package HomeWorks.HW7.Ex2;

public class Liner extends WaterVehicle {

    private int floors;

    public Liner(int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }

    @Override
    public void isSailing() {
        System.out.println("Liner is sailing");
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
