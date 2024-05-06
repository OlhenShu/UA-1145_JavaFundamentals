package edu05.task03;

import java.util.Scanner;

import static java.lang.System.in;

public class CarApplication {
    private static final Scanner SCANNER = new Scanner(in);

    public static void main(String[] args) {
        CarApplication application = new CarApplication();

        Car[] cars = {new Car("Citroen Jumpy", 2012, 2), new Car("Ford Focus", 2013, 1.6), new Car("Volvo S", 2004, 2.4), new Car("Volkswagen Caravelle", 1999, 2.5)};

        System.out.println("Input 'year of production' of car what you seeking ");
        int inputYear = SCANNER.nextInt();
        SCANNER.nextLine();

        boolean respond = application.checkYearOfModel(cars, inputYear);

        if (!respond) {
            System.out.println("There is no cars from '" + inputYear + "' this year of production");
        }
        System.out.println("=".repeat(60));

        //placing cars in ascending order
        application.sort(cars);
        for (var car : cars) {
            System.out.println(car.getCarType() + ", year of production: " + car.getYearOfProduction() + " and capacity of engine: " + car.getEngineCapacity());
        }
    }

    public boolean checkYearOfModel(Car[] cars, int carYear) {
        boolean found = false;

        for (var car : cars) {
            if (car.getYearOfProduction() == carYear) {
                System.out.println(car);
                found = true;
            }
        }
        return found;
    }

    public void sort(Car[] cars) {
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - i - 1; j++) {
                if (cars[j].getYearOfProduction() > cars[j + 1].getYearOfProduction()) {
                    var temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                }
            }
        }
    }
}
