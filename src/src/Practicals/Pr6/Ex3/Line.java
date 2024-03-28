package Practicals.Pr6.Ex3;

public class Line extends AbstractLine {
    Point p1;
    Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;

        AbstractLine.lineList.add(this);
    }

    @Override
    public String toString() {
        return "Line{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                "}\n";
    }
}
