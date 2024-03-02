import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        System.out.print("Input the first number: ");
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        System.out.print("Input the second number: ");
        b=in.nextInt();
        System.out.print("Input the third number: ");
        c=in.nextInt();
        in.close();

        SmallestNumber triangle=new SmallestNumber(a,b,c);
        System.out.print("The smallest number is " + triangle.getMinNumber());
    }
}