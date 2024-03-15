package edu05.car;

public class Car {
    private final String type;
    private final int yearOfProduction;
    private final double capacity;

    Car(String type, int yearOfProduction, double capacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public double getCapacity() {
        return capacity;
    }

    public void showInfo() {
        System.out.print("Type: " + this.getType() + '\n' + "Year: " + this.yearOfProduction + '\n' + "Capacity: " + this.getCapacity() + '\n');
    }
}

