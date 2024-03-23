package homeworks.homework_edu06.Practical.Task2;

public class Sedan extends Car {
    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
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
