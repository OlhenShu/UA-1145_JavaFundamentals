package Task3;

import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        Car car1 = new Car("Coupe", 2004, 2.0);
        Car car2 = new Car("Sedan", 1999, 1.5);
        Car car3 = new Car("Truck", 2004, 2.0);
        Car car4 = new Car("Sport", 2009, 4.0);

        Car.certainModel(car1, car2, car3, car4);
        Car.sortByYear(car1, car2, car3, car4);
    }
}
