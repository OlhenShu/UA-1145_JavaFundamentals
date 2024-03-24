import java.util.*;

class Car {
    String type;
    int yearOfProduction;
    double engineCapacity;

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
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Sedan", 2019, 2.0);
        Car car2 = new Car("SUV", 2020, 2.5);
        Car car3 = new Car("Hatchback", 2018, 1.8);
        Car car4 = new Car("Convertible", 2021, 3.0);

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        System.out.println("Cars sorted by year of production:");
        Collections.sort(cars, Comparator.comparingInt(Car::getYearOfProduction));
        for (Car car : cars) {
            System.out.println("Type: " + car.getType() + ", Year: " + car.getYearOfProduction() + ", Engine Capacity: " + car.getEngineCapacity());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a year to filter cars: ");
        int inputYear = scanner.nextInt();
        System.out.println("Cars of year " + inputYear + ":");
        for (Car car : cars) {
            if (car.getYearOfProduction() == inputYear) {
                System.out.println("Type: " + car.getType() + ", Year: " + car.getYearOfProduction() + ", Engine Capacity: " + car.getEngineCapacity());
            }
        }
        scanner.close();
    }
}
