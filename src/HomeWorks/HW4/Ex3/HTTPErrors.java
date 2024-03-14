package HomeWorks.HW4.Ex3;

import java.util.HashMap;
import java.util.Scanner;

public class HTTPErrors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, String> hashMap = new HashMap<>(); // I`m too lazy to add more))
        hashMap.put (400, "Bad Request");
        hashMap.put (401, "Bad Unauthorized");
        hashMap.put (402, "Payment Required");
        hashMap.put (403, "Forbidden");
        hashMap.put (404, "Not Found");

        System.out.print("Input the error code: ");
        int errorNumb = scanner.nextInt();
        scanner.close();

        System.out.println("Error " + errorNumb + " is " + hashMap.get(errorNumb));

    }
}
