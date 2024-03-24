package edu06;

public class Parallelogram extends Shape {
    private int width;
    private int height;
    private int angle;

    public Parallelogram(int width, int height, int angle) {
        this.width = width;
        this.height = height;
        this.angle = angle;
    }

    @Override
    public double getArea() {
        return (int) (width * height * Math.sin(angle * Math.PI / 180));
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }


}
