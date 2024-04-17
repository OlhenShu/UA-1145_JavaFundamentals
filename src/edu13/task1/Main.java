package edu13.task1;

import java.util.Scanner;

public class Main {
    public static String encrypt(String s, int n) {
        StringBuilder encryptedString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                char encryptedChar = (char) (((ch - 'a' + n) % 26) + 'a');
                encryptedString.append(encryptedChar);
            } else {
                encryptedString.append(ch);
            }
        }
        return encryptedString.toString();
    }

    public static String decrypt(String s, int n) {
        StringBuilder decryptedString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {
                char decryptedChar = (char) (((ch - 'a' - n + 26) % 26) + 'a');
                decryptedString.append(decryptedChar);
            } else {
                decryptedString.append(ch);
            }
        }
        return decryptedString.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int shift;

        System.out.print("Enter a word: ");
        String original = in.nextLine();
        System.out.print("Enter the shift value (integer, indicating the alphabetic shift): ");
        shift = in.nextInt();
        String encrypted = encrypt(original, shift);
        String decrypted = decrypt(encrypted, shift);
        System.out.println("Original word: " + original);
        System.out.println("Encrypted word: " + encrypted);
        System.out.println("Decrypted word: " + decrypted);

        in.close();
    }
}