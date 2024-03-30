package HomeWorks.HW7.Ex2;

public class Bus extends GroundVehicle {
    private String route;

    public Bus(int passengers, String route) {
        super(passengers);
        this.route = route;
    }

    @Override
    public void drive() {
        System.out.println("Bus is driving");
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}
