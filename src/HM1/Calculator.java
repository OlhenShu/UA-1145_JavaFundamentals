package HM1;

import java.util.Scanner;

public class Calculator {
        public static void main(String[] args) {
            System.out.println("Калькулятор");
            float a , b , c;
            System.out.println("Введіть два числа");
            Scanner sc = new Scanner(System.in);
            a = sc.nextFloat();
            b = sc.nextFloat();
            System.out.println("Виберіть одну з дій , яку ви хочете виконати:");
            System.out.println("a + b  (1)");
            System.out.println("a - b  (2)");
            System.out.println("a / b  (3)");
            System.out.println("a * b  (4)");
            System.out.println("Виберіть дію , яку ви хочете виконати : ");
            c = sc.nextInt();
            if ( c == 1){
                System.out.print((int)(a));
                System.out.print(" + ");
                System.out.print((int)(b));
                System.out.print(" = ");
                System.out.print((int)(a + b));
            }
            else if (c == 2 ) {
                System.out.print((int)(a));
                System.out.print(" - ");
                System.out.print((int)(b));
                System.out.print(" = ");
                System.out.print((int)(a - b));
            }
            else if (c == 3 ) {
                System.out.print((int)(a));
                System.out.print(" / ");
                System.out.print((int)(b));
                System.out.print(" = ");
                System.out.print(a / b);
            }
            else{
                System.out.print((int)(a));
                System.out.print(" * ");
                System.out.print((int)(b));
                System.out.print(" = ");
                System.out.print((int)(a * b));
            }
        }
    }
