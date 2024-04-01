package homework.hw5.car;

import java.util.*;

public class CarMain {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        carList.add(new Car(2002, 1.2, CarType.SEDAN));
        carList.add(new Car(2012, 2.0, CarType.VANS));
        carList.add(new Car(2018, 1.8, CarType.CROSSOVER));
        carList.add(new Car(2012, 3.0, CarType.COUPE));

        carList.forEach(System.out::println);

        System.out.println("-----------------------------------------");

        carList.stream().sorted(Comparator.comparingInt(Car::getYearOfProduction)).forEach(System.out::println);

        System.out.println("-----------------------------------------");

        int year = scanner.nextInt();
        carList.stream().filter(car -> car.getYearOfProduction() == year).toList().forEach(System.out::println);
    }
}
