package HomeWorks.HW13.Ex1;

import java.util.function.UnaryOperator;

public class StringEncryptRunner {

    public static void main(String[] args) {
        String string = "This is my very long interesting string";
        int code = 5;
        String string1 = encrypt(string, code);
        System.out.println(string1);
        String string2 = decrypt(string1, code);
        System.out.println(string2);
    }

    private static String encrypt(String string, int code) {
        UnaryOperator<Character> operator = x -> (char) (x + code);

        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isAlphabetic(chars[i])) {
                chars[i] = operator.apply(chars[i]);
            }
        }
        return new String(chars);
    }

    private static String decrypt(String string, int code) {
        UnaryOperator<Character> operator = x -> (char) (x - code);

        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!Character.isWhitespace(chars[i])) {
                chars[i] = operator.apply(chars[i]);
            }
        }
        return new String(chars);
    }
}
