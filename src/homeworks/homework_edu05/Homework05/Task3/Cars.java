package homework_edu05.Homework05.Task3;

import java.util.Scanner;

public class Cars {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Car[] carsModels = {
                new Car("Sedan", 2000, 6.0),
                new Car("Sedan", 2000, 2.0),
                new Car("Hatchback", 1999, 1.0),
                new Car("Sedan", 2003, 4.0),


        };

        System.out.println("Enter year of the car: ");
        int yearOfCar = SCANNER.nextInt();
        boolean fount = false;
        for (var carModel : carsModels) {
            if (carModel.getYearOfProduction() == yearOfCar) {
                System.out.println(carModel);
                fount = true;
            }
        }
        if (!fount) {
            System.out.println("There are no cars from " + yearOfCar + " year of production.");
        }

        System.out.println("=".repeat(100));
        bubbleSort(carsModels);
        for (var carsModel : carsModels){
            System.out.println(carsModel);
        }


    }

    static void bubbleSort(Car[] cars) {
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - i - 1; j++) {
                if (cars[j].getYearOfProduction() < cars[j + 1].getYearOfProduction()) {
                    var swap = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = swap;
                }

            }

        }
    }
}


class Car {
    private String type;
    private int yearOfProduction;
    private double engineCapacity;

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
