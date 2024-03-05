package HW4;

import java.util.Scanner;

public class CheckRangeForThreeNumbers {
    public static void main(String[] args) {
        float first, second, third;
        boolean check=true;

        Scanner in=new Scanner(System.in);
        System.out.print("Please input first number: ");
        first=in.nextFloat();
        System.out.print("Please input second number: ");
        second=in.nextFloat();
        System.out.print("Please input third number: ");
        third=in.nextFloat();
        in.close();

        if ((first<-5 || first>5) || (second<-5 || second>5) || (third<-5 || third>5)) {
            check=false;
        }

        if (check) {
            System.out.print("All three numbers are included into the range");
        }
        else {
            System.out.print("At least one of three numbers is not included into the range");
        }

    }
}
