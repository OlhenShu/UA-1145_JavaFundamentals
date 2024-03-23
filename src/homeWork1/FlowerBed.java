package homeWork1;
import java.lang.Math;
public class FlowerBed {

    protected double calculatePerimeter(double radius){
        return 2*(Math.PI*radius);
    }

    protected double calculateArea(double radius){
        return Math.PI* Math.pow(radius, 2);
    }
}
