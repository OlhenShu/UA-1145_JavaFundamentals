package homework2;
import java.util.Scanner;
public class minimum {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Input the first number: ");
        a = sc1.nextInt();
        System.out.println("Input the second number : ");
        b = sc1.nextInt();
        System.out.println("Input the third number : ");
        c = sc1.nextInt();
        sc1.close();
        System.out.println("The smallest number is: " + minimum.min(a, b, c));

    }

    public static int min(int c, int d, int e) {
        
        int m = 0;
        if (c <= d && c <= e)
            m = c;
        else if (d <= c && d <= e)
            m = d;
        else m = e;
        return m;
    }
}
