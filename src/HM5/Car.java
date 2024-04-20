package HM5;

import java.util.Objects;
import java.util.Scanner;

public class Car {
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

    public void setType(String type) {
        this.type = type;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void ChangeYear(int yearOfProduction) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter the new Year of production value: ");
        int newInput = sr.nextInt();
        this.yearOfProduction = newInput;
    }
}

class BaseCar {
    public static void main(String[] args) {

        Scanner sr = new Scanner(System.in);
        Car car1 = new Car("Micro", 2015, 1.5);
        Car car2 = new Car("Hatchback", 2012, 2.0);
        Car car3 = new Car("Muscle car", 2005, 4.0);
        Car car4 = new Car("Super car", 2022, 3.6);

        System.out.println("Type :" + car1.getType() + "\t" + "Year of ptoduction: "
                + car1.getYearOfProduction() + "\t" + "Engine capacity: "
                + car1.getEngineCapacity());
        System.out.println("Type :" + car2.getType() + "\t"
                + "Year of ptoduction: " + car2.getYearOfProduction() + "\t" +
                "Engine capacity: " + car2.getEngineCapacity());
        System.out.println("Type :" + car3.getType() + "\t"
                + "Year of ptoduction: " + car3.getYearOfProduction() + "\t" +
                "Engine capacity: " + car3.getEngineCapacity());
        System.out.println("Type :" + car4.getType() + "\t"
                + "Year of ptoduction: " + car4.getYearOfProduction() + "\t" +
                "Engine capacity: " + car4.getEngineCapacity());
        String repeat;
        do {
            System.out.println("Enter the car number you want to change the production year for (1-4): ");
            int carNumber = sr.nextInt();

            // Perform year change based on user input
            switch (carNumber) {
                case 1:
                    car1.ChangeYear(car1.getYearOfProduction());
                    break;
                case 2:
                    car2.ChangeYear(car2.getYearOfProduction());
                    break;
                case 3:
                    car3.ChangeYear(car3.getYearOfProduction());
                    break;
                case 4:
                    car4.ChangeYear(car4.getYearOfProduction());
                    break;
                default:
                    System.out.println("Invalid car number.");
            }

            // Print updated information
            System.out.println("Type: " + car1.getType() + "\t" + "Year of production: "
                    + car1.getYearOfProduction() + "\t" + "Engine capacity: "
                    + car1.getEngineCapacity());
            System.out.println("Type: " + car2.getType() + "\t"
                    + "Year of production: " + car2.getYearOfProduction() + "\t"
                    + "Engine capacity: " + car2.getEngineCapacity());
            System.out.println("Type: " + car3.getType()
                    + "\t" + "Year of production: " + car3.getYearOfProduction() + "\t"
                    + "Engine capacity: " + car3.getEngineCapacity());
            System.out.println("Type: " + car4.getType() + "\t" + "Year of production: "
                    + car4.getYearOfProduction() + "\t" + "Engine capacity: "
                    + car4.getEngineCapacity());
            System.out.println("Do you want to change year of production in another car? (YES/NO)");
            repeat = sr.next();
        } while (Objects.equals(repeat.toUpperCase(), "YES"));
        Car[] arr = {
                new Car("Micro", 2015, 1.5),
                new Car("Hatchback", 2012, 2.0),
                new Car("Muscle car", 2005, 4.0),
                new Car("Super car", 2022, 3.6)
        };
        SortYearOfProduction(arr);
    }

    public static void SortYearOfProduction(Car[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].getYearOfProduction() < arr[j + 1].getYearOfProduction()) {
                    var tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for (var person : arr) {
            System.out.println(person.getType() + ":" + person.getYearOfProduction());
        }
    }

}

