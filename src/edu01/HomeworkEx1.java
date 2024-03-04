package edu01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeworkEx1 {

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please input radius of flower bed");
            int radius = Integer.parseInt(br.readLine());
            double Area = (Math.PI * Math.pow(radius, 2));
            double Perimeter = 2 * (Math.PI * radius);

            System.out.println("The Area of that flower bed is " + Area);
            System.out.println("The Perimeter of that flower bed is " + Perimeter);

            br.close();
        }
    }

