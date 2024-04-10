package Task_01;
import java.util.Scanner;

import static java.lang.System.in;

public class WorkWithString {
    static Scanner scanner = new Scanner(in);

    public static String inputString() {
        System.out.println("Enter the string which u want to encrypt and decrypt");
        return scanner.nextLine();
    }

    public static int inputNumber() {
       while (true) {
           try{
               System.out.println("Enter the number to which the letters should be transferred during encryption and decryption");
               return Integer.parseInt(scanner.nextLine());
           } catch(NumberFormatException e) {
               System.out.println("Entered number is non-integer. Please enter a correct number");
           }
       }
    }

    public static String encrypt(String s, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char stringChar = s.charAt(i);
            if (Character.isLetter(stringChar)) {
                char encryptedStringChar = (char) (stringChar + n);
                if ((Character.isLowerCase(stringChar) && encryptedStringChar > 'z') ||
                        (Character.isUpperCase(stringChar) && encryptedStringChar > 'Z')) {
                    encryptedStringChar = (char) (stringChar - (26 - n));
                }
                stringBuilder.append(encryptedStringChar);
            } else {
                stringBuilder.append(stringChar);
            }
        }
        return stringBuilder.toString();
    }

    public static String decrypt(String s, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char stringChar = s.charAt(i);
            if (Character.isLetter(stringChar)) {
                char decryptedStringChar = (char) (stringChar - n);
                if ((Character.isLowerCase(stringChar) && decryptedStringChar < 'a') ||
                        (Character.isUpperCase(stringChar) && decryptedStringChar < 'A')) {
                    decryptedStringChar = (char) (stringChar + (26 - n));
                }
                stringBuilder.append(decryptedStringChar);
            } else {
                stringBuilder.append(stringChar);
            }
        }
        return stringBuilder.toString();
    }
}
