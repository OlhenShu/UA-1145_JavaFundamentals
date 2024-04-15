package Practicals.Pr12.Ex2;

import java.util.Locale;

public class Plant {
    private Type type;
    private Color color;
    private int size;

    public Plant(String type, String color, int size) throws ColorException, TypeException {
        Color c = colorStrToEnum(color);
        Type t = typeStrToEnum(type);
        this.size = size;
        this.type = t;
        this.color = c;
    }

    private Color colorStrToEnum(String color) throws ColorException {

        return switch (color.toLowerCase(Locale.ROOT)) {
            case "blue" -> Color.BLUE;
            case "red" -> Color.RED;
            case "white" -> Color.WHITE;
            default -> throw new ColorException("Input only color blue, red or white");
        };
    }

    private Type typeStrToEnum(String type) throws TypeException {
        return switch (type.toLowerCase(Locale.ROOT)) {
            case "rose" -> Type.ROSE;
            case "lily" -> Type.LILY;
            case "orchid" -> Type.ORCHID;
            default -> throw new TypeException("Input only type lily, orchid or rose");
        };
    }


    public class ColorException extends Exception {
        public ColorException(String arg0) {
            super(arg0);
        }
    }

    public class TypeException extends Exception {
        public TypeException(String arg0) {
            super(arg0);
        }
    }

    @Override
    public String toString() {
        return "Plant{" +
                "type=" + type +
                ", color=" + color +
                ", size=" + size +
                '}';
    }
}