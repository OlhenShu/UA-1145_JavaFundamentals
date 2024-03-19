package HomeWorks.HW5.Ex3;

import java.util.ArrayList;
import java.util.Collections;

import static HomeWorks.HW5.Ex2.DoWhileLoop.SCANNER;

public class Car {
    private String type;
    private int yearOfProduction;
    private int engineCapacity;

    public static ArrayList<Car> carList = new ArrayList<>();

    public Car(String type, int yearOfProduction) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        carList.add(this);
    }

    public static void printCarsOfYear() {
        System.out.print("Input here a year for searching: ");
        int year = SCANNER.nextInt();

        ArrayList<Car> cloneList = new ArrayList<>();
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getYearOfProduction() == year) {
                cloneList.add(carList.get(i));
            }
        }
        System.out.print("All cars of selected year: ");
        if (cloneList.size() == 0) {
            System.out.println("There were no cars in selected year :(");
        }
        for (int i = 0; i < cloneList.size() - 1; i++) {
            Car car = cloneList.get(i);
            System.out.print(car.getType() + "/ ");
        }
        System.out.println(cloneList.get(cloneList.size() - 1).getType());
    }


    public static void printSortedCarsByYear() {
        ArrayList<Car> cloneList = (ArrayList<Car>) carList.clone();
        for (int i = 0; i < carList.size() - 1; i++) {
            Car temp1 = cloneList.get(i);
            Car temp2 = cloneList.get(i + 1);
            if (temp1.getYearOfProduction() > temp2.getYearOfProduction()) {
                Car temp = temp1;
                Collections.swap(cloneList, i, i + 1);
                i = 0;
            }
        }
        System.out.println(cloneList.toString());
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
