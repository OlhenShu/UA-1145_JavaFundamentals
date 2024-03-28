package Practicals.Pr6.Ex3;

public class ColorLine extends Line {

    private String color;

    public ColorLine(Point p1, Point p2, String color) {
        super(p1, p2);
        this.color = color;

        AbstractLine.lineList.add(this);
    }

    @Override
    public String toString() { //як зробити кому на тому ж рядку після виведення об'єктів?
        return "ColorLine{" +
                "color='" + color + '\'' +
                ", p1=" + p1 +
                ", p2=" + p2 +
                "}\n";
    }
}
