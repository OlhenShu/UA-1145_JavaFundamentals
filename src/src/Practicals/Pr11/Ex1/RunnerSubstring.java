package Practicals.Pr11.Ex1;

public class RunnerSubstring {

    public static void main(String[] args) {
        String str1 = "SoftServe";
        String str2 = "SoftServe Academy";
        String str3 = "Java";

        boolean is_substring = str2.startsWith(str1);

        System.out.println(is_substring);

        is_substring = str2.startsWith(str3);
        System.out.println(is_substring);
    }
}
