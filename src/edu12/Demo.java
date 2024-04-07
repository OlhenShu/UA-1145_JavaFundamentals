package edu12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

    public static void main(String[] args) {
        int a = div();
        System.out.println(a);
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static int div() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter number one");
            int n = Integer.parseInt(br.readLine());
            System.out.println("Enter number one");
            int k = Integer.parseInt(br.readLine());
            return n / k;
        } catch (NumberFormatException | IOException e) {
            return -1;
        } catch (ArithmeticException e) {
            return -2;
        } catch (Exception e) {
            return -3;
        } catch (Throwable e) {
            return -4;
        }
    }
}
