package homework7.hw7_task2;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles ={
                new Liner(15, 4),
                new Boat(3, 20),
                new Plane(50, 150),
                new Helicopter(5, 150,1000),
                new Bus(20, "Lviv"),
                new Motorcycle(2, 120),
                new Car(4, "Lamborgini")
        };
        for(var vehicle : vehicles){
            if(vehicle instanceof WaterVehicle){
                ((WaterVehicle) vehicle).isSailing();
                System.out.println(vehicle);
                System.out.println("|-|".repeat(15));
            } else if (vehicle instanceof FlyingVehicle) {
                ((FlyingVehicle) vehicle).fly();
                ((FlyingVehicle) vehicle).land();
                System.out.println(vehicle);
                System.out.println("|-|".repeat(15));
            } else if (vehicle instanceof  GroundVehicle) {
                ((GroundVehicle) vehicle).drive();
                System.out.println(vehicle);
                System.out.println("|-|".repeat(15));
            }
        }
    }
}
