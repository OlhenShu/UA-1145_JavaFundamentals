package edu12.practical;

enum Color {
    White,
    Red,
    Blue
}

enum Type {
    ROSE,
    LILY,
    TULIP
}

class ColorException extends Exception {
    public ColorException(String arg0) {
        super(arg0);
    }
}

class TypeException extends Exception {
    public TypeException(String arg0) {
        super(arg0);
    }
}

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
        return switch (color.toLowerCase()) {
            case "blue" -> Color.Blue;
            case "red" -> Color.Red;
            case "white" -> Color.White;
            default -> throw new ColorException("Input only color blue, red or white");
        };
    }

    private Type typeStrToEnum(String type) throws TypeException {
        return switch (type.toLowerCase()) {
            case "lily" -> Type.LILY;
            case "rose" -> Type.ROSE;
            case "tulip" -> Type.TULIP;
            default -> throw new TypeException("Input only type rose, tulip or lily");
        };
    }


    public static void main(String[] args) {
        String[] types = {"rose", "lily", ""};
        String[] colors = {"red", "blue", ""};
        int[] sizes = {3, 5, 7};
        for (int i = 0; i < 3; i++) {
            try {
                Plant pl = new Plant(types[i], colors[i], sizes[i]);
                System.out.println(pl);
            } catch (ColorException | TypeException e) {
                System.err.println(e.getMessage() + "\n");
                //e.printStackTrace();
            }
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
