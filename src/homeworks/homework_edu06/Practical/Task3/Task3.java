package homeworks.homework_edu06.Practical.Task3;

public class Task3 {
    public static void main(String[] args) {
        Line[] lines = {
                new Line(new Point(2, 4), new Point(5, 6)),
                new Line(new Point(8, 2), new Point(6, 11)),
                new ColorLine(new Point(7, 0), new Point(9, 2), "Red"),
                new ColorLine(new Point(0, 12), new Point(1, 6), "Green"),
        };

        for (Line line : lines) {
            line.print();
        }


    }

}

class Point {
    protected int x;
    protected int y;

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

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void print() {
        System.out.println(toString());
    }
}

class Line {
    protected Point startPoint;
    protected Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    @Override
    public String toString() {
        return "Line{" +
                "startPoint=" + startPoint +
                ", endPoint=" + endPoint +
                '}';
    }

    public void print() {
        System.out.println(toString());
    }
}

class ColorLine extends Line {

    protected String color;

    public ColorLine(Point startPoint, Point endPoint, String color) {
        super(startPoint, endPoint);
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +
                '}';
    }

    public void print() {
        System.out.println(toString());
    }
}

