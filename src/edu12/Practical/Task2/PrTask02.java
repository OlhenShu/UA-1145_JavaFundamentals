package edu12.Practical.Task2;

import java.util.Arrays;
import java.util.Scanner;

enum Color {
    WHITE, RED, BLUE
}

enum Type {
    GRASS, BUSH, TREE, ROSE
}

class Plant {
    private Type type;
    private Color color;
    private int size;

    static class ColorException extends Exception {
        public ColorException(String message) {
            super(message);
        }
    }

    static class TypeException extends Exception {
        public TypeException(String message) {
            super(message);
        }
    }

    public Plant(String typeStr, String colorStr, int size) throws ColorException, TypeException {
        Color color = colorStrToEnum(colorStr);
        Type type = typeStrToEnum(typeStr);
        this.size = size;
        this.type = type;
        this.color = color;
    }

    private Type typeStrToEnum(String typeStr) throws TypeException {
        for (var type : Type.values()) {
            if (typeStr.equalsIgnoreCase(type.name())) {
                return type;
            }
        }
        throw new TypeException("Input a type from the list: " + Arrays.toString(Type.values()));
    }

    static Color colorStrToEnum(String colorStr) throws ColorException {
        for (var color : Color.values()) {
            if (colorStr.equalsIgnoreCase(color.name())) {
                return color;
            }
        }
        throw new ColorException("Input a color from the list: " + Arrays.toString(Color.values()));
    }

    @Override
    public String toString() {
        return "This a plant of type %s of color %s of size %d"
                .formatted(
                        type.toString().toLowerCase(),
                        color.toString().toLowerCase(),
                        size);
    }

    static Plant readFromConsole() {
        var SCANNER = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter the plant parameters.");
                System.out.println("Enter type: ");
                String typeStr = SCANNER.nextLine();
                System.out.println("Enter color: ");
                String colorStr = SCANNER.nextLine();
                System.out.println("Enter the size");
                int size = Integer.parseInt(SCANNER.nextLine());
                return new Plant(typeStr, colorStr, size);
            } catch (ColorException | TypeException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Size should be a number");
            }
        }
    }
}

public class PrTask02 {
    public static void main(String[] args) throws Plant.ColorException, Plant.TypeException {
        Plant[] plants = new Plant[2];
        for (int i = 0; i < plants.length; i++) {
            plants[i] = Plant.readFromConsole();
        }
        for (var plant : plants) {
            System.out.println(plant);
        }
    }
}

