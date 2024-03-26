package homeworks.homework_edu07.homework.Task2;

public class Bus extends GroundVehicle {
    public Bus(int passengers) {
        super(passengers);
    }

    @Override
    void drive() {

    }

    private String route;

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}
