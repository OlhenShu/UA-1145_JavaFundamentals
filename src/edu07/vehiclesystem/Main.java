package edu07.vehiclesystem;

public class Main {
    public static void main(String[] args) {
        Passengers[] passengers = {
                new Liner(100, 4),
                new Boat(400, 1000),
                new Plane(15, 25),
                new Helicopter(5, 1000, 4000),
                new Bus(100, "Lviv-Kyiv"),
                new Motorcycle(1, 200),
                new Car(5, "Renault Rigan")
        };

        for (var passenger : passengers) {
            System.out.println("Passengers on " + passenger.getClass().getSimpleName() + ": " + passenger.getPassengers());
            if (passenger instanceof Liner liner) {
                System.out.println("Liner floors: " + liner.getFloors());
                liner.setFloors(5); // Setting floors for Liner
                System.out.println("Updated Liner floors: " + liner.getFloors());
                System.out.print("Is Liner sailing? ");
                liner.isSailing();
            } else if (passenger instanceof Boat boat) {
                System.out.println("Boat volume: " + boat.getVolume());
                boat.setVolume(1200); // Setting volume for Boat
                System.out.println("Updated Boat volume: " + boat.getVolume());
                System.out.print("Is Boat sailing? ");
                boat.isSailing();
            } else if (passenger instanceof Plane plane) {
                System.out.println("Plane max distance: " + plane.getMaxDistance());
                plane.setMaxDistance(30); // Setting max distance for Plane
                System.out.println("Updated Plane max distance: " + plane.getMaxDistance());
                System.out.print("Fly Plane: ");
                plane.fly();
                System.out.print("Land Plane: ");
                plane.land();
            } else if (passenger instanceof Helicopter helicopter) {
                System.out.println("Helicopter weight: " + helicopter.getWeight());
                System.out.println("Helicopter max height: " + helicopter.getMaxHeight());
                helicopter.setWeight(1200); // Setting weight for Helicopter
                helicopter.setMaxHeight(4500); // Setting max height for Helicopter
                System.out.println("Updated Helicopter weight: " + helicopter.getWeight());
                System.out.println("Updated Helicopter max height: " + helicopter.getMaxHeight());
                System.out.print("Fly Helicopter: ");
                helicopter.fly();
                System.out.print("Land Helicopter: ");
                helicopter.land();
            } else if (passenger instanceof Bus bus) {
                System.out.println("Bus route: " + bus.getRoute());
                bus.setRoute("Kyiv-Lviv"); // Setting route for Bus
                System.out.println("Updated Bus route: " + bus.getRoute());
                System.out.print("Drive Bus: ");
                bus.drive();
            } else if (passenger instanceof Motorcycle motorcycle) {
                System.out.println("Motorcycle max speed: " + motorcycle.getMaxSpeed());
                motorcycle.setMaxSpeed(250); // Setting max speed for Motorcycle
                System.out.println("Updated Motorcycle max speed: " + motorcycle.getMaxSpeed());
                System.out.print("Drive Motorcycle: ");
                motorcycle.drive();
            } else if (passenger instanceof Car car) {
                System.out.println("Car model: " + car.getModel());
                car.setModel("Tesla Model S"); // Setting model for Car
                System.out.println("Updated Car model: " + car.getModel());
                System.out.print("Drive Car: ");
                car.drive();
            }
            System.out.println("\n-------------------------------------------");
        }
    }
}
