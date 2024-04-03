package Homework_7.Task2;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car(4),
                new Bus(52),
                new Motorcycle(1),
                new Plane(172),
                new Helicopter(8, 2000, 600),
                new Liner(3750),
                new Boat(5),
        };

        for (var vehicle : vehicles) {
            System.out.println("The " + vehicle.getClass().getSimpleName()
                    + " has " + ((Passengers) vehicle).getPassengers() + " passengers.");
            if (vehicle instanceof WaterVehicle) {
                ((WaterVehicle) vehicle).isSailing();
                System.out.println();
            } else if (vehicle instanceof GroundVehicle) {
                ((GroundVehicle) vehicle).drive();
                System.out.println();
            } else if (vehicle instanceof FlyingVehicle) {
                ((FlyingVehicle) vehicle).fly();
                ((FlyingVehicle) vehicle).land();
                System.out.println();
            } else {
                System.out.println("The vehicle is not identified");
            }
        }
    }
}
