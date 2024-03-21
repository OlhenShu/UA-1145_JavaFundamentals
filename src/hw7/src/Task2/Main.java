package Task2;

public class Main {
    public static void main(String[] args) {
        Passengers[] passengers = {
                new Liner(2000, 3),
                new Boat(18,5),
                new Plane(50, 6000),
                new Helicopter(10, 500, 20),
                new Bus(25, "Lviv -> Odesa"),
                new Motorcycle(2, 300),
                new Car(4, "Audi RS7")
        };
        for(int i = 0; i < passengers.length; i++) {
            if(passengers[i] instanceof Liner liner) {
                liner.isSailing();
                System.out.println("The number of liner`s floats is: " + liner.getFloors());
                liner.setFloors(4);
                System.out.println("New number of liner`s floats is: " + liner.getFloors());
                System.out.println(" ");
            }
            if(passengers[i] instanceof Boat boat) {
                boat.isSailing();
                System.out.println("The number of boat`s volume is: " + boat.getVolume());
                boat.setVolume(6);
                System.out.println("New number of boat`s volume is: " + boat.getVolume());
                System.out.println(" ");
            }
            if(passengers[i] instanceof Plane plane) {
                plane.fly();
                plane.land();
                System.out.println("Plane`s max distance is: " + plane.getMaxDistance());
                plane.setMaxDistance(10000);
                System.out.println("New plane`s max distance is: " + plane.getMaxDistance());
                System.out.println(" ");
            }
            if(passengers[i] instanceof Helicopter helicopter) {
                helicopter.fly();
                helicopter.land();
                System.out.println(" ");
            }
            if(passengers[i] instanceof Bus bus) {
                bus.drive();
                System.out.println("Bus route is: " + bus.getRoute());
                bus.setRoute("Lviv -> Kyiv");
                System.out.println("New bus route is: " + bus.getRoute());
                System.out.println(" ");
            }
            if(passengers[i] instanceof Motorcycle motorcycle) {
                motorcycle.drive();
                System.out.println("Motorcycle`s max speed is: " + motorcycle.getMaxSpeed());
                motorcycle.setMaxSpeed(400);
                System.out.println("New motorcycle`s max speed is: " + motorcycle.getMaxSpeed());
                System.out.println(" ");
            }
            if(passengers[i] instanceof Car car) {
                car.drive();
                System.out.println("Car`s model is: " + car.getModel());
                car.setModel("Mercedes C-Class");
                System.out.println("New car`s model is: " + car.getModel());
            }
        }
    }
}
