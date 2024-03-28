package Practicals.Pr6.Ex2;

import java.util.ArrayList;

public abstract class Car {
    private String model;
    private int maxSpeed;
    private int yearOfProduction;

    public static int carCounter = 0;

    public static ArrayList<Car> carList = new ArrayList<>();

    public Car(String model) {
        this.model = model;
        carCounter++;
        carList.add(this);
    }

    public abstract void run();

    public abstract void stop();

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }
}
