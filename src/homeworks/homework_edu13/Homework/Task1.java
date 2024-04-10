package homeworks.homework_edu13.Homework;

public class Task1 {
    public static void main(String[] args) {
        String encrypts = encrypt("abc", 3);
        System.out.println("Encrypt: " + encrypts);

        String decrypts = decrypt(encrypts, 3);
        System.out.println("Decrypt: " + decrypts);
    }

    public static String encrypt(String s, int n) {
        StringBuilder stringEncrypt = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);

            char encryptChar;
            if (Character.isLetter(letter)) {
                encryptChar = (char) (letter + n);
                if ((Character.isLowerCase(letter) && encryptChar > 'z') ||
                        (Character.isUpperCase(letter) && encryptChar > 'Z')) {
                    encryptChar -= 26;
                } else if ((Character.isLowerCase(letter) && encryptChar < 'a') ||
                        (Character.isUpperCase(letter) && encryptChar < 'A')) {
                    encryptChar -= 26;
                }
                stringEncrypt.append(encryptChar);

            } else {
                stringEncrypt.append(letter);
            }


        }
        return stringEncrypt.toString();
    }

    public static String decrypt(String s, int n) {
        return encrypt(s, -n);
    }
}
