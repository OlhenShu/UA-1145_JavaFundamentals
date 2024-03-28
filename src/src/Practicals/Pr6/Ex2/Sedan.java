package Practicals.Pr6.Ex2;

public class Sedan extends Car {
    public Sedan(String model) {
        super(model);
    }

    @Override
    public void run() {
        System.out.println("Sedan is running");
    }

    @Override
    public void stop() {
        System.out.println("Sedan stopped");

    }
}
