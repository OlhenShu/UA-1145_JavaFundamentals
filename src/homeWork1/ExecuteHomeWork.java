package homeWork1;

public class ExecuteHomeWork {
    public static void main(String[] args) {
        FlowerBed flowerBed = new FlowerBed();
        System.out.println(flowerBed.calculateArea(23));
        System.out.println(flowerBed.calculatePerimeter(12));

        NameAndAddress nameAndAddress = new NameAndAddress();
        nameAndAddress.greeting();

        CallCostCalculation callCostCalculation = new CallCostCalculation();
        callCostCalculation.callCostCalculator();
    }
}
