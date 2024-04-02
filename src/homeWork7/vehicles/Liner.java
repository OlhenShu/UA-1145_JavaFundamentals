package homeWork7.vehicles;

public class Liner extends WaterVehicle {
    private int floors;

    public Liner(int passengers) {
        super(passengers);
    }

    @Override
    public void isSailing() {
        System.out.println("Liner is sailing.");
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
