package edu13.task4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1983, 06, 25);
        printDayOfWeekInfo(birthday);

        //Alternative option when user is asked to enter his/her day of birthday (to do this, comment two lines above)
        /*Scanner in = new Scanner(System.in);
        System.out.println("Please enter your birthday: ");
        String birthday = in.next();
        String[] words = birthday.split("\\.");
        LocalDate birthDay = LocalDate.of(Integer.parseInt(words[2]), Integer.parseInt(words[1]), Integer.parseInt(words[0]));
        printDayOfWeekInfo(birthDay);
        in.close();*/
    }

    public static void printDayOfWeekInfo(LocalDate birthday) {

        System.out.println("The day of the week of your birthday was: " + birthday.getDayOfWeek());

        LocalDate afterSixMonths = birthday.plusMonths(6);
        DayOfWeek afterSixMonthsDayOfWeek = afterSixMonths.getDayOfWeek();
        System.out.println("The day of the week 6 months after your birthday was: " + afterSixMonthsDayOfWeek);

        LocalDate after12Months = birthday.plusMonths(12);
        DayOfWeek after12MonthsDayOfWeek = after12Months.getDayOfWeek();
        System.out.println("The day of the week 12 months after your birthday was: " + after12MonthsDayOfWeek);
    }
}