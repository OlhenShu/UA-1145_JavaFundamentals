package Practicals.Pr6.Ex3;

public class RunnerLine {
    public static void main(String[] args) {
        Line line1 = new Line(new Point(1, 2), new Point(3, 4));
        Line line2 = new Line(new Point(5, 9), new Point(4, 2));
        Line line3 = new Line(new Point(9, 5), new Point(0, 7));
        ColorLine colorLine1 = new ColorLine(new Point(1, 2), new Point(3, 4), "red");
        ColorLine colorLine2 = new ColorLine(new Point(5, 9), new Point(4, 2), "green");
        ColorLine colorLine3 = new ColorLine(new Point(9, 5), new Point(0, 7), "blue");
        ColorLine colorLine4 = new ColorLine(new Point(1, 2), new Point(3, 4), "yellow");

        System.out.println(AbstractLine.lineList.toString());
    }
}
