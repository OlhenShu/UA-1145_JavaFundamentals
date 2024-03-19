package HomeWorks.HW5.Ex3;

public class Runner {
    public static void main(String[] args) {

        Car car1 = new Car("bus", 1988);
        Car car2 = new Car("sedan", 2019);
        Car car3 = new Car("sport", 2024);
        Car car4 = new Car("hatchback", 2009);
        Car car5 = new Car("sedan", 2024);
        Car car6 = new Car("hatchback", 2024);
        Car car7 = new Car("bus", 2024);

        System.out.println(Car.carList.toString());

        Car.printSortedCarsByYear();

        Car.printCarsOfYear();

    }
}
