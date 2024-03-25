package edu07.HomeWork02;

public class Main {
    public static void main(String[] args) {


        Liner liner = new Liner(3460, 5);
        Boat boat = new Boat(4, 320);
        Plane plane = new Plane(260, 1600);
        Helicopter helicopter = new Helicopter(4, 3550, 2000);
        Bus bus = new Bus(80, "To Dublin");
        Motorcycle motorcycle = new Motorcycle(2, 280);
        Car car = new Car(5, "Crossover");

        System.out.println(liner);
        liner.isSailing();
        System.out.println("=".repeat(40));

        System.out.println(boat);
        boat.isSailing();
        System.out.println("=".repeat(40));

        System.out.println(plane);
        plane.fly();
        plane.land();
        System.out.println("=".repeat(40));

        System.out.println(helicopter);
        helicopter.fly();
        helicopter.land();
        System.out.println("=".repeat(40));

        System.out.println(bus);
        bus.drive();
        System.out.println("=".repeat(40));

        System.out.println(motorcycle);
        motorcycle.drive();
        System.out.println("=".repeat(40));

        System.out.println(car);
        car.drive();
        System.out.println("=".repeat(40));
    }

}
