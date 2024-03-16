package task4;
//3.* Create class called Car with fields: type, year of production and engine capacity.
//        • Create and initialize in main() method four instances of class Car.
//        • Output result for cars:
//o certain model year (enter year in the console);
//o sorted cars by the field “year of production ”.
//        4.** Create a program that generates a random number and prompts to the user to guess
//what the number is. If the user's guess is higher than the random number, the program
//should display "Too high, try again." If the user's guess is lower than the random number,
//the program should display "Too low, try again." The program should use a loop that
//repeats until the user correctly guesses the random number.
//5**. Add Unit Tests to each task, publish code on GitHub.
public class Car {
    String type;
    int yearOfProduction;
    int engineCapacity;

    public Car(String type, int yearOfProduction, int engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Sedan", 2015, 2000);
        Car car2 = new Car("SUV", 2018, 2500);
        Car car3 = new Car("Hatchback", 2010, 1600);
        Car car4 = new Car("Convertible", 2022, 1800);
    }
}
