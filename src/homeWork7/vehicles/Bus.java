package homeWork7.vehicles;

public class Bus extends GroundVehicle {
    private String route;

    public Bus(int passengers) {
        super(passengers);
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
        System.out.println("Test text for Bus > drive method.");
    }
}
