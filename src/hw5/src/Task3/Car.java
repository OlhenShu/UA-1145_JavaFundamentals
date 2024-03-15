package Task3;
import java.util.Arrays;

import static Task3.Main.SCANNER;

public class Car {
    private String type;
    private int yearOfProduction;
    private double engineCapacity;

    public Car(String type, int yearOfProduction, double engineCapacity) {
        if (type == null || yearOfProduction < 0 || engineCapacity <= 0.0) {
            throw new IllegalArgumentException("Invalid parameters for Car constructor");
        }
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public static void certainModel(Car car1, Car car2, Car car3, Car car4) {
        Car[] cars = {car1, car2, car3, car4};
        System.out.println("Please, enter the year of production: ");
        boolean found = false;
        int year = SCANNER.nextInt();
        for (int i = 0; i < cars.length; i++) {
            if(year == cars[i].getYearOfProduction()) {
                System.out.println(cars[i]);
                found = true;
                System.out.println(" ");
            }
        };
        if(!found) {
            System.out.println("I did not find anything! Try another year");
        }
    }

    public static Car[] sortByYear(Car car1, Car car2, Car car3, Car car4) {
        Car[] cars = {car1, car2, car3, car4};
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - i - 1; j++) {
                if (cars[j].getYearOfProduction() > cars[j + 1].getYearOfProduction()) {
                    Car temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                }
            }
        }
        System.out.println("List of cars sorted by year of production:");
        System.out.println(Arrays.toString(cars));
        return cars;
    }


    @Override
    public String toString() {
        return '\n' + "Cartype: " + type + '\n' +
                "Year of production: " + yearOfProduction + '\n' +
                "Engine сapacity: " + engineCapacity;
    }
    public int getYearOfProduction() {
        return yearOfProduction;
    }

}