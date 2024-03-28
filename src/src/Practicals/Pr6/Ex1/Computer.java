package Practicals.Pr6.Ex1;

public abstract class Computer {
    static String brand = "Generic";

    public abstract void turnOn();

    public void shutDown() {
        System.out.println("Shutting down computer...");
    }

    static void printBrand() {
        System.out.println("Computer brand: " + brand);
    }
}

class DesktopComputer extends Computer {
    public void turnOn() {
        System.out.println("Turning on desktop computer...");
    }
}

class LaptopComputer extends Computer {
    public void bootUp() {
        System.out.println("Turning on laptop computer...");
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on laptop computer...");
    }
}

class Main {
    public static void main(String[] args) {
        Computer desktop = new DesktopComputer();
        Computer laptop = new LaptopComputer();

        desktop.turnOn();
        laptop.turnOn();
        desktop.shutDown();
        DesktopComputer.printBrand();
        LaptopComputer.printBrand();
        Computer.printBrand();
    }
}

