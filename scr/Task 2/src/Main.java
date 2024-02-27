
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Radius=");
        String R = sc.nextLine();
        double perimetr = Math.PI * 2 ;
        double area = Math.PI * ( perimetr  * perimetr );

        System.out.println("Perimetr=" + perimetr);
        System.out.println("Area=" + area);




    }
};
