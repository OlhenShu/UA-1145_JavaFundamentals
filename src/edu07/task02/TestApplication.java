package edu07.task02;

public class TestApplication {
    public static void main(String[] args) {
        Passengers[] passengers = {
                new Liner(2140, 12),
                new Boat(4, 4),

                new Plane(300, 9700),
                new Helicopter(4, 4500, 7500),

                new Bus(30, "Cherkasy - Kyiv"),
                new Motorcycle(1, 320),
                new Car(4, "Wolvo Generic")
        };

        for (var passenger : passengers) {
            System.out.println("This is "+passenger.getClass().getSimpleName()
                    +", it can transport " + passenger.getPassengers() + " passengers");

            if (passenger instanceof WaterVehicle) {
                ((WaterVehicle) passenger).isSailing();
            }

            if (passenger instanceof FlyingVehicle) {
                ((FlyingVehicle) passenger).fly();
                ((FlyingVehicle) passenger).land();
            }

            if (passenger instanceof GroundVehicle){
                    ((GroundVehicle) passenger).drive();
            }
            System.out.println();
        }

    }
}