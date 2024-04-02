package homeWork11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

    private String inputSentence(Scanner sc) {
        System.out.println("Please enter a sentence of five words => ");
        return sc.nextLine();
    }

    void matchUSCurrency(Scanner sc){
        String sentence = inputSentence(sc);
        Pattern pattern = Pattern.compile("\\$[0-9,]+(\\.[0-9]{2})?");
        Matcher matcher = pattern.matcher(sentence);

        while (matcher.find()){
            while (matcher.find()) {
                System.out.println("Found: " + matcher.group());
            }
        }
    }
}
class RunTask3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task3 task3 = new Task3();
        task3.matchUSCurrency(scanner);
    }

}
