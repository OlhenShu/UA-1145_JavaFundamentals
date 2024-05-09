package edu13.task2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static boolean isValidDate(String date) {
        String pattern = "^(0[1-9]|1[0-2])\\.(0[1-9]|[12][0-9]|3[01])\\.\\d{2}$";

        Pattern regexPattern = Pattern.compile(pattern);

        Matcher matcher = regexPattern.matcher(date);

        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Enter the date in the format \"mm.dd.yy\": ");
            String date = in.nextLine();
            isValid = isValidDate(date);
            System.out.println("Date validation result (true/false): " + isValidDate(date));

            if (!isValid) {
                System.out.println("Invalid date format. Please try again.");
            }
        }

        in.close();
    }

}
//This method uses a regular expression to check if the date string matches the format mm.dd.yy.
// It validates the format, but not the legitimacy of the date (e.g., 02.31.24 would pass).

// If this method will be called frequently,
// consider making the Pattern object a static final field of the class to avoid re-compiling the regex on each function call,
// which can be more efficient.

//public class Main {
//
//    private static final Pattern DATE_PATTERN =
//            Pattern.compile("^(0[1-9]|1[0-2])\\.(0[1-9]|[12][0-9]|3[01])\\.\\d{2}$");
//
//    public static boolean isValidDate(String date) {
//        Matcher matcher = DATE_PATTERN.matcher(date);
//        if (!matcher.matches()) {
//            return false;
//        }
//
//        //
//        String[] parts = date.split("\\.");
//        int month = Integer.parseInt(parts[0]);
//        int day = Integer.parseInt(parts[1]);
//        int year = Integer.parseInt(parts[2]);
//
//        if (month == 2) {
//            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//
//                return day <= 29;
//            } else {
//
//                return day <= 28;
//            }
//        }
//
//        return true;
//    }
//
//    public static void main(String[] args) {
//        try (Scanner in = new Scanner(System.in)) {
//            boolean isValid = false;
//
//            while (!isValid) {
//                System.out.print("Enter the date in the format \"mm.dd.yy\": ");
//                String date = in.nextLine();
//                isValid = isValidDate(date);
//                System.out.println("Date validation result (true/false): " + isValid);
//
//                if (!isValid) {
//                    System.out.println("Invalid date format or day count in February. Please try again.");
//                }
//            }
//        }
//    }
//}