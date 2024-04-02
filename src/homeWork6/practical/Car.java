package homeWork6.practical;

abstract class Car {
    String model;
    int maxSpeed;
    int yearOfProduction;

    public Car(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    abstract void run();

    abstract void stop();

    @Override
    public String toString() {
        return "\nCar information: " +
                "model = '" + model + '\'' +
                ", maxSpeed = " + maxSpeed +
                ", yearOfProduction = " + yearOfProduction +
                " .";
    }
}

class Truck extends Car {
    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model,maxSpeed,yearOfProduction);
    }

    @Override
    void run() {
        System.out.println(model + " Truck is running.");
    }

    @Override
    void stop() {
        System.out.println(model + " Truck stopped.");
    }
}

class Sedan extends Car {

    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model,maxSpeed,yearOfProduction);
    }

    @Override
    void run() {
        System.out.println(model + " Sedan is running.");
    }

    @Override
    void stop() {
        System.out.println(model + " Sedan stopped.");
    }
}

class RunCar{
    public static void main(String[] args) {
        Car[] cars = {
                new Truck("truckModel1", 120,1997),
                new Sedan("sedanModel1", 130,2000),
                new Truck("truckModel2",150,2005),
                new Sedan("sedanModel2", 130,2001),
                new Truck("truckModel3",160,2010)
        };
        for(Car car: cars){
            System.out.println(car);
            car.run();
            car.stop();
        }
    }

}
