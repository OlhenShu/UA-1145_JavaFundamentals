package First;

import java.util.Scanner;

public class Main {
    static public final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        Triangle.input();
        Triangle.triangleExistence();
        Triangle.calculateArea();
    }
}
