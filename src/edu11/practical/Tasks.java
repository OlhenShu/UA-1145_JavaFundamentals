package edu11.practical;

public class Tasks {
    public static void main(String[] args) {
        //Task1
        String str1 = "SoftServe";
        String str2 = "SoftServe Academy";
        boolean isContains = str2.contains(str1);
        System.out.println(isContains);

        //Task2
        String firstName = "Anna";
        String middleName = "Olehivna";
        String lastName = "Shevchenko";
        System.out.println(lastName + " " + firstName.charAt(0) + "." + middleName.charAt(0) + ".");

        //Task3
        String[] usernames = {
                "Olha_12345",
                "An",
                "qwertyu",
                "Анна",
        };

        for (String username : usernames) {
            String regex = "[a-zA-Z0-9_]{3,15}";
            if (username.matches(regex)) {
                System.out.println(username + " is valid value");
            } else {
                System.out.println(username + " is not valid value");
            }
        }

    }
}