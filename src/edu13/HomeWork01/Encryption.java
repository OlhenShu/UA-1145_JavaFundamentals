package edu13.HomeWork01;

import java.util.Scanner;

import static java.lang.System.in;

public class Encryption {

    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        System.out.println("Enter the text to encrypt: ");
        String originalText = scan.nextLine();
        int shift = 3;

        String encryptedText = encrypt(originalText, shift);
        System.out.println("Encrypted text: " + encryptedText);

        String decryptedText = decrypt(encryptedText, shift);
        System.out.println("Decrypted text: " + decryptedText);
    }

    // Method to encrypt a string
    public static String encrypt(String s, int n) {
        return processText(s, n, (text, shift) -> {
            StringBuilder result = new StringBuilder();
            for (char c : text.toCharArray()) {
                if (Character.isLetter(c)) {
                    char base = Character.isLowerCase(c) ? 'a' : 'A';
                    char shiftedChar = (char) (((c - base + n) % 26) + base);
                    result.append(shiftedChar);
                } else {
                    result.append(c);
                }
            }
            return result.toString();
        });
    }

    // Method to decrypt a string
    public static String decrypt(String s, int n) {
        return processText(s, n, (text, shift) -> {
            StringBuilder result = new StringBuilder();
            for (char c : text.toCharArray()) {
                if (Character.isLetter(c)) {
                    char base = Character.isLowerCase(c) ? 'a' : 'A';
                    char shiftedChar = (char) (((c - base - n + 26) % 26) + base);
                    result.append(shiftedChar);
                } else {
                    result.append(c);
                }
            }
            return result.toString();
        });
    }

    // Txt processing
    public static String processText(String s, int n, Cipher cipher) {
        return cipher.apply(s, n);
    }

    @FunctionalInterface
    interface Cipher {
        String apply(String s, int n);
    }
}
