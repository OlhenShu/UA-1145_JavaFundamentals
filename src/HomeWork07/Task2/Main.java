package HomeWork07.Task2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(5, "Audi Q8");
        Motorcycle motorcycle = new Motorcycle(2, 300);
        Bus bus = new Bus(30, "To Kyiv");
        Plane plane = new Plane(50, 2200);
        Helicopter helicopter = new Helicopter(4, 2000, 1500);
        Boat boat = new Boat(20, 200);
        Liner liner = new Liner(100, 50);

        System.out.println(car);
        car.drive();
        System.out.println();

        System.out.println(motorcycle);
        motorcycle.drive();
        System.out.println();

        System.out.println(bus);
        bus.drive();
        System.out.println();

        System.out.println(plane);
        plane.fly();
        plane.land();
        System.out.println();

        System.out.println(helicopter);
        helicopter.fly();
        helicopter.land();
        System.out.println();

        System.out.println(boat);
        boat.isSailing();
        System.out.println();

        System.out.println(liner);
        liner.isSailing();
        System.out.println();
    }
}
