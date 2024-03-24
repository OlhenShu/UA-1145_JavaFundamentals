package edu06;

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Circle extends Point {
    // private Point point;
    private int radius;


    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }
}

class Demo {
    public static void main(String[] args) {
        // Circle circle = new Circle(new Point(25, 38), 13);
        Circle circle = new Circle(25, 38, 13);
    }
}