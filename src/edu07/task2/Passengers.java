package edu07.task2;

abstract class Passengers {
    private int passengers;

    public Passengers(int passengers) {
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}

interface Vehicle {

}

abstract class WaterVehicle extends Passengers implements Vehicle {
    public void isSailing() {

    }

    public WaterVehicle(int passengers) {
        super(passengers);
    }
}

abstract class FlyingVehicle extends Passengers implements Vehicle {
    public void fly() {

    }

    public void land() {

    }

    public FlyingVehicle(int passengers) {
        super(passengers);
    }
}

abstract class GroundVehicle extends Passengers implements Vehicle {
    public void drive() {

    }

    public GroundVehicle(int passengers) {
        super(passengers);
    }
}

class Liner extends WaterVehicle {
    private int floors;

    @Override
    public void isSailing() {
        super.isSailing();
    }

    public Liner(int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}

class Boat extends WaterVehicle {
    private int volume;

    public Boat(int passengers, int volume) {
        super(passengers);
        this.volume = volume;
    }

    @Override
    public void isSailing() {
        super.isSailing();
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}

class Plane extends FlyingVehicle {
    private int maxDistance;

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public void land() {
        super.land();
    }

    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}

class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxWeight;

    public Helicopter(int passengers, int weight, int maxWeight) {
        super(passengers);
        this.weight = weight;
        this.maxWeight = maxWeight;
    }

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public void land() {
        super.land();
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
}

class Bus extends GroundVehicle {
    private String route;

    public Bus(int passengers, String route) {
        super(passengers);
        this.route = route;
    }

    @Override
    public void drive() {
        super.drive();
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}

class Motorcycle extends GroundVehicle {
    private int maxSpeed;

    public Motorcycle(int passengers, int maxSpeed) {
        super(passengers);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        super.drive();
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

class Car extends GroundVehicle {
    private String model;

    public Car(int passengers, String model) {
        super(passengers);
        this.model = model;
    }

    @Override
    public void drive() {
        super.drive();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}