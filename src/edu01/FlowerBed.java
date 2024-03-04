package edu01;
import java.util.Scanner;

/*
Flower bed is shaped like a circle. Calculate its perimeter and area. Input the radius
from the console, and output obtained results.
 */

public class FlowerBed {

    // Опис метода для обчислення периметру. L=2*PI*r
    public static double perimeter(double flowerBedRadius) {
        return Math.PI * 2 * flowerBedRadius;
    }

    // Опис метода для обчислення площі. S=PI*r*r
    public static double area(double flowerBedRadius) {
        return Math.PI * flowerBedRadius * flowerBedRadius;
    }

    public static void main(String[] args) {
        double flowerBedRadius;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вас вітає малофункціональний \"штучний інтелект\".");
        System.out.println("Я можу допомогти вам з обчисленням периметру та площі клумби, бо більше я нічого не вмію.");
        System.out.println("Для цього мені потрібно знати радіус клумби, тому введіть його у метрах:");

        // Тут юзер додає радіус.
        flowerBedRadius = scanner.nextDouble();

        System.out.println("Мої вітання! Малофункціональний ШІ підрахував периметр та площу клумби.");
        //Тут використовується форматування строк таким чином, щоб число double виводилося з двома знаками після коми.
        System.out.printf("Периметр клумби = %.2f", perimeter(flowerBedRadius));
        System.out.println("m");
        System.out.printf("Площа клумби = %.2f", area(flowerBedRadius));
        System.out.println("m²");

        /*
        Звісно, все це можна було підрахувати одразу в параметрах метода print, використовуючи конкатенацію,
        і виглядало б це таким чином, як у двох закомментованих рядках нижче:
        */
        //System.out.println("Периметр клумби = " + (Math.PI * 2 * flowerBedRadius));
        //System.out.println("Площа клумби = " + (Math.PI * flowerBedRadius * flowerBedRadius));

        //Але мені здається, що primary рішення виглядає більш елегантним.
        scanner.close();
    }
}