import java.util.Scanner;

public class PhoneCallCalc {
    public static void main(String[] args) {
        System.out.println("Hello!");

        Scanner scanner = new Scanner(System.in);

        String[] arr = new String[]{"first", "second", "third"};
        double[] singleResultArr = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Input cost per minute for the " + arr[i] + " phone call:");
            double c = Double.parseDouble(scanner.nextLine());
            System.out.println("Input duration for the " + arr[i] + " phone call:");
            double t = Double.parseDouble(scanner.nextLine());
            double singleResult = c * t;
            singleResultArr[i] = singleResult;
        }
        double total = 0;

        for (int i = 0; i < singleResultArr.length; i++) {
            total += singleResultArr[i];
        }

        System.out.println("The cost of each call is: " + singleResultArr[0] + "; " + singleResultArr[1] + "; " + singleResultArr[2] + ". And the total cost is: " + total);

        scanner.close();
    }
}
