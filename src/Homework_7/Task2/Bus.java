package Homework_7.Task2;

class Bus extends GroundVehicle {
    private String route;

    public Bus(int passengers) {
        super(passengers);
    }

    @Override
    void drive() {
        System.out.println("Bus is driving");
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}
