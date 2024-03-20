package edu07.task2;


public class TestProgram {
    public static void main(String[] args) {
        Passengers[] passengers = {
                new Liner(100, 5),
                new Boat(7, 8),
                new Plane(50, 300),
                new Helicopter(5, 300, 400),
                new Bus(20, "Rome"),
                new Motorcycle(2, 120),
                new Car(4, "Tesla"),
        };
        for (var passenger : passengers) {
            System.out.println("The vehicle can accommodate " + passenger.getPassengers() + " passengers");
            if (passenger instanceof Liner) {
                int floor = ((Liner) passenger).getFloors();
                System.out.println("Linear floors is: " + ((Liner) passenger).getFloors());
                System.out.println();
            }
            if (passenger instanceof Boat) {
                int volume = ((Boat) passenger).getVolume();
                System.out.println("Boat Volume is: " + ((Boat) passenger).getVolume());
                System.out.println();
            }
            if (passenger instanceof Plane) {
                int maxDistance = ((Plane) passenger).getMaxDistance();
                System.out.println("Plane max distance is: " + ((Plane) passenger).getMaxDistance());
                System.out.println();
            }
            if (passenger instanceof Helicopter) {
                int weight = ((Helicopter) passenger).getWeight();
                int maxWeight = ((Helicopter) passenger).getMaxWeight();
                System.out.println("Current passengers weight is: " + ((Helicopter) passenger).getWeight());
                System.out.println("Max passengers weight for helicopter is: " + ((Helicopter) passenger).getWeight());
                System.out.println();
            }
            if (passenger instanceof Bus) {
                String route = ((Bus) passenger).getRoute();
                System.out.println("The direction of the bus is: " + ((Bus) passenger).getRoute());
                System.out.println();
            }
            if (passenger instanceof Motorcycle) {
                int maxSpeed = ((Motorcycle) passenger).getMaxSpeed();
                System.out.println("The motorcycle max speed is: " + ((Motorcycle) passenger).getMaxSpeed());
                System.out.println();
            }
            if (passenger instanceof Car) {
                String model = ((Car) passenger).getModel();
                System.out.println("The model of the car is: " + ((Car) passenger).getModel());
                System.out.println();
            }
        }
    }
}