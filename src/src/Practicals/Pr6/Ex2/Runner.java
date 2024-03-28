package Practicals.Pr6.Ex2;

public class Runner {
    public static void main(String[] args) {

        Sedan sedan1 = new Sedan("Red Sedan");
        Sedan sedan2 = new Sedan("Blue Sedan");
        Sedan sedan3 = new Sedan("Black Sedan");
        Truck truck1 = new Truck("White Truck");
        Truck truck2 = new Truck("Green Truck");
        Truck truck3 = new Truck("Yellow Truck");

        System.out.println("Total car number is " + Car.carCounter);

        System.out.println(Car.carList.toString());
    }
}
