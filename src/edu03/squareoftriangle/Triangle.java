package edu03.squareoftriangle;//package name should be in lower case

public class Triangle {//better naming would be TriangleCalculator
    double firstSide;
    double secondSide;
    double thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public double getArea() {
        double p = (firstSide + secondSide + thirdSide) / 2.0; //single letter variable names are not recommended, better naming would be halfPerimeter
        double s = Math.sqrt(p * (p - firstSide) * (p - secondSide) * (p - thirdSide));//better naming would be area
        return s;
    }
    //for the future, it would be better to add a method to check if the triangle is valid,
    //for example, if the sum of two sides is less than the third side, the triangle is not valid
}
