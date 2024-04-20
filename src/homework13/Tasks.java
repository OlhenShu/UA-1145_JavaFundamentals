package homework13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Tasks {
    public static void main(String[] args) {
        //task1
        System.out.println("Task 1 (decrypt,encrypt)");
        System.out.println("-".repeat(5));
        String line ="abc";
        int shift = 3;
        String encrypted = encrypt(line,shift);
        System.out.println(encrypted);
        String decrypted = decrypt(encrypted,shift);
        System.out.println(decrypted);
        System.out.println("*".repeat(5));
        //task2
        System.out.println("Task 2 (valid date)");
        System.out.println("-".repeat(5));
        String valid = "04.20.24";
        String invalid = "25.25.25";
        System.out.println(validatingDate(valid));
        System.out.println(validatingDate(invalid));
        System.out.println("*".repeat(5));
        //task3
        System.out.println("Task 3 (check if the year is leap)");
        System.out.println("-".repeat(5));
        int year = 2003;
        System.out.println(checkIfYearIsLeap(year));
        System.out.println("*".repeat(5));
        //task4
        System.out.println("Task 4 (birthday and shifting the years)");
        System.out.println("-".repeat(5));
        LocalDate birthday = LocalDate.of(2005, Month.AUGUST,2);
        printDayOfWeek(birthday,6);
        printDayOfWeek(birthday,12);
        System.out.println("*".repeat(5));
    }
    //task1
    public static String encrypt(String s, int n){
        StringBuilder encrypted = new StringBuilder();
        for (char character:s.toCharArray()){
            if (Character.isLetter(character)){
                char shift = (char) (((character-'a'+n)%26)+'a');
                encrypted.append(shift);
            }else {
                encrypted.append(character);
            }
        }
        return encrypted.toString();
    }
    public static String decrypt(String s, int n){
        return encrypt(s,26-n);
    }
    //task2
    public static boolean validatingDate(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
        try{
            LocalDate.parse(date,formatter);
            return true;
        }catch (DateTimeParseException exception){
            return false;
        }
    }
    //task3
    public static boolean checkIfYearIsLeap(int year){
        return Year.of(year).isLeap();
    }
    //task4
    public static void printDayOfWeek(LocalDate date, int months){
        LocalDate newDate = date.plusMonths(months);
        DayOfWeek dayOfWeek = newDate.getDayOfWeek();
        DayOfWeek trueDayOfWeek = date.getDayOfWeek();
        System.out.println("Правдивий час є: "+ trueDayOfWeek+". Після змін на "+months+" місяців, він став "+dayOfWeek);
    }
}
