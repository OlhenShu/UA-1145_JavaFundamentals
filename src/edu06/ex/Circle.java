package edu06.ex;

public class Circle {
    private double radius;

    // Constructors
    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
// Getters and Setters
}