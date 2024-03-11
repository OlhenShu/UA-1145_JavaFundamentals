public class Triangle {
    private double side1;
    private double side2;
    private double side3;
    private double perimeter;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.perimeter=getHalfPerimeter();
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }


    public double getArea(){
        return Math.sqrt(perimeter*(perimeter-side1)*(perimeter-side2)*(perimeter-side3));
    }
    public double getHalfPerimeter() {
        return (side1 + side2 + side3)/2;
    }
}
