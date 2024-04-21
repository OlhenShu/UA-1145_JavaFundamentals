import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a message to encrypt:");
        String message = scanner.nextLine();

        System.out.println("Enter the encryption shift (a number between 1 and 25):");
        int shift = scanner.nextInt();
        scanner.nextLine();

        String encryptedMessage = encrypt(message, shift);
        System.out.println("Encrypted message: " + encryptedMessage);

        String decryptedMessage = decrypt(encryptedMessage, shift);
        System.out.println("Decrypted message: " + decryptedMessage);

        scanner.close();
    }

    public static String encrypt(String s, int n) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                char encryptedChar = (char) ((c - 'a' + n) % 26 + 'a');
                result.append(encryptedChar);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static String decrypt(String s, int n) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                char decryptedChar = (char) ((c - 'a' - n + 26) % 26 + 'a');
                result.append(decryptedChar);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
