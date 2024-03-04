package HW3.SquareOfTriangle;

public class Triangle {
    double firstSide;
    double secondSide;
    double thirdSide;
    public Triangle (double firstSide, double secondSide, double thirdSide) {
        this.firstSide=firstSide;
        this.secondSide=secondSide;
        this.thirdSide=thirdSide;
    }
    public double getArea() {
        double p=(firstSide+secondSide+thirdSide)/2.0;
        double s=Math.sqrt(p*(p-firstSide)*(p-secondSide)*(p-thirdSide));
        return s;
    }
}
