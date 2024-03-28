package Practicals.Pr6.Ex2;

public class Truck extends Car {
    public Truck(String model) {
        super(model);
    }

    @Override
    public void run() {
        System.out.println("Truck is running");
    }

    @Override
    public void stop() {
        System.out.println("Truck stopped");
    }
}
