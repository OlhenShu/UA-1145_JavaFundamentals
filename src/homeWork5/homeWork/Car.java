package homeWork5.homeWork;

import java.util.Scanner;

public class Car {
    private final String type;
    private final int yearOfProduction;
    private final int engineCapacity;

    public Car(String type, int yearOfProduction, int engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    static void findModelByYear(Car[] cars) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the year of car production ->> ");
        int year = scanner.nextInt();
        for (Car car : cars) {
            if (year == car.getYearOfProduction()) {
                System.out.println("Model " + car.getType() + " was made at " + year);
            }
        }
    }

    static void sortByProductionYearDesc(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[j].getYearOfProduction() > cars[i].getYearOfProduction()) {
                    Car temp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = temp;
                }
            }
        }
        System.out.println("Cars sorted by year of production: ");
        for (Car car : cars) {
            System.out.println("Model " + car.getType() + " year " + car.getYearOfProduction() +
                    " engine capacity " + car.getEngineCapacity());
        }
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public String getType() {
        return type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
}

class RunCars {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("Reno1", 1997, 5),
                new Car("Reno2", 2000, 6),
                new Car("Reno3", 1995, 6),
                new Car("Reno4", 2001, 6),
                new Car("Reno5", 1997, 6)
        };
        Car.findModelByYear(cars);
        Car.sortByProductionYearDesc(cars);
    }
}
