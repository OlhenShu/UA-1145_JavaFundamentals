package edu13.task1;
public class EncryptionUtil {

    public static String encrypt(String s, int n) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                char encryptedChar = (char) (((c - 'a' + n) % 26) + 'a');
                encrypted.append(encryptedChar);
            } else {
                encrypted.append(c);
            }
        }
        return encrypted.toString();
    }

    public static String decrypt(String s, int n) {
        return encrypt(s, 26 - n);
    }

    public static void main(String[] args) {
        String original = "abc";
        int shift = 3;

        String encrypted = encrypt(original, shift);
        System.out.println("Encrypted: " + encrypted);

        String decrypted = decrypt(encrypted, shift);
        System.out.println("Decrypted: " + decrypted);
    }
}
