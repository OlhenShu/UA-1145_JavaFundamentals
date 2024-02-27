package homework1;
import java.util.Scanner;
public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        calculatedArea();
        System.out.println();
        userInformation();
        System.out.println();
        callInformation();
    }
    //task1
    public static void calculatedArea(){
        System.out.println("Введіть площу кола: ");
        int radius = scan.nextInt();

        double area = Math.round(Math.PI * (radius * radius));
        double perimeter = Math.round(2 * (Math.PI * radius));

        System.out.println("Площа дорівнює: "+area+ "\nПериметр дорівнює: "+perimeter);
    }
    public static void userInformation(){
        System.out.println("Введіть своє ім'я: ");
        String name = scan.next();
        System.out.println("Введіть вашу адресу проживання, "+name);
        String adress = scan.next();
        System.out.println("Ваше ім'я: "+name+"\nВаш адрес: "+adress);
    }
    public static void callInformation(){
        System.out.println("Введіть вартість першого дзвінку: ");
        double c1 = scan.nextDouble();
        System.out.println("Введіть час першого дзвінку: ");
        int t1 = scan.nextInt();
        System.out.println("Введіть вартість другого дзвінку: ");
        double c2 = scan.nextDouble();
        System.out.println("Введіть час другого дзвінку: ");
        int t2 = scan.nextInt();
        System.out.println("Введіть вартість третього дзвінку: ");
        double c3 = scan.nextDouble();
        System.out.println("Введіть час третього дзвінку: ");
        int t3 = scan.nextInt();

        System.out.println("Вартість першого дзвінку = "+(c1*t1)+"\nВартість другого дзвінку = "+(c2*t2)+"\nВартість третього дзвінку = "+(c3*t3)+"\nУсього вартість трьох дзвінків становить = "+((c1*t1)+(c2*t2)+(c3*t3)));
    }
}
