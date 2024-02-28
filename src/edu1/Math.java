//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Math {
    public Math() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius=");
        String R = sc.nextLine();
        double perimetr = 6.283185307179586;
        double area = java.lang.Math.PI * perimetr * perimetr;
        System.out.println("Perimetr=" + perimetr);
        System.out.println("Area=" + area);
    }
}