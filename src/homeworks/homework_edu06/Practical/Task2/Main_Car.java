package homeworks.homework_edu06.Practical.Task2;

public class Main_Car {
    public static void main(String[] args) {
        Car[] cars = {
                new Sedan("Nissan Versa", 200, 2020),
                new Sedan("Honda Civic", 250, 2021),
                new Sedan("Toyota Corolla", 280, 2019),
                new Truck("Dodge Ram", 200, 2022),
                new Truck("Ford F150", 180, 2020),
        };

        for (Car car:cars) {

            System.out.println("Model: " + car.getModel());
            System.out.println("Max Speed: " + car.getMaxSpeed());
            System.out.println("Year of production: " + car.getYearOfProduction());
            car.run();
            car.stop();
            System.out.println();

        }
    }
}
