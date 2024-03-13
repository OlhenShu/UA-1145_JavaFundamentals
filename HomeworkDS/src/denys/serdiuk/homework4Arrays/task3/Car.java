package denys.serdiuk.homework4Arrays.task3;

import java.util.Scanner;

public class Car {

	private String type;
	private int productionYear;
	private int engineCap;

	public Car(String type, int productionYear, int engineCap) {
		this.type = type;
		this.productionYear = productionYear;
		this.engineCap = engineCap;
	}

	public static int carYear(Car[] cars, int prodYear) {
		int numCars = 0;
		for (Car car : cars) {
			if (car.productionYear == prodYear) {
				numCars ++;
			}
		}
		return numCars;
	}

	public static Car[] sortCars(Car[] cars) {
		for (int i = 0; i < cars.length - 1; i++) { // length 2
			for (int j = 0; j < cars.length - i - 1; j++) { // 2 > 1 > 0;
				if (cars[j].productionYear > cars[j + 1].productionYear) {
					Car temp = cars[j];
					cars[j] = cars[j + 1];
					cars[j + 1] = temp;
				}
			}
		}
		return cars;
	}

	@Override
	public String toString() {
		return "Car [brand=" + type + ", productionYear=" + productionYear + ", engineCap=" + engineCap + "]";
	}

	public static void main(String[] args) {
		Car prius = new Car("Toyota Prius", 2014, 1200);
		Car renault = new Car("Renault Megane", 2005, 1400);
		Car volkswagen = new Car("Volkswagen Passat", 2003, 2000);
		Car bmw = new Car("BMW 318", 2010, 1500);

		Car[] cars = { prius, renault, volkswagen, bmw };

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input the desired year: ");
		int prodYear = scanner.nextInt();
		System.out.println(carYear(cars, prodYear));
		scanner.close();

		sortCars(cars);
		for (Car car : cars) {
			System.out.println(car.toString());
		}

	}

}
