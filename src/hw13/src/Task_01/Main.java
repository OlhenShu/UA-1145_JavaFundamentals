package Task_01;

public class Main {
    public static void main(String[] args) {
        String inputString = WorkWithString.inputString();
        int inputNumber = WorkWithString.inputNumber();
        String stringEncryption = WorkWithString.encrypt(inputString, inputNumber);
        String stringDecryption = WorkWithString.decrypt(stringEncryption, inputNumber);
        System.out.printf("Your string is: %s.\n" +
                "Your encrypted string is: %s.\n" +
                "Your decrypted string is: %s", inputString, stringEncryption, stringDecryption);
    }
}
