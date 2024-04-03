package edu11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    public static void main(String[] args) {
//        String str1 = "      some text      ";
////        System.out.println( str1.stripLeading());
////        System.out.println(str1.stripTrailing());
////        System.out.println(str1.strip());
//        String str2 = "cats. and dogs.";
//        // var res = str2.replace("s", "");
//        var res = str2.replaceAll("\\.", "!");
//        //System.out.println(res);
//
////        System.out.println("".isBlank());
////        System.out.println("".isEmpty());
////        System.out.println("   ".isBlank());
////        System.out.println("   ".isEmpty());
//        String str3 = "java";
//        String str4 = "jAVA";
//        String str5 = "a";
//        // System.out.println(str3.equals(str4));
//        // System.out.println(str3.equalsIgnoreCase(str4));
//        // System.out.println(str3.compareTo(str4));
//        //   System.out.println(str3.compareToIgnoreCase(str4));
//        String[] values = "1.2.3.4.5".splitWithDelimiters("\\.", -1);
//        // System.out.println(Arrays.toString(values));
//        String s1 = "Java";
//        String s2 = "Java";
//        String s3 = "Java";
//        s3 = s3.intern();
////        System.out.println(s1 + "==" + s2 + " : " + (s1 == s2));
////        System.out.println(s1 + "==" + s3 + " : " + (s1 == s3));
////        System.out.println(s1 + " equals " + s2 + " : " + s1.equals(s2));
////        System.out.println(s1 + " equals " + s3 + " : " + s1.equals(s3));
//        String name = "Anan";
//        int age = 18;
//        String message = String.format("Hello, %s. You are %d years old", name, age);
//        System.out.println(message);
//        Calendar calendar = Calendar.getInstance();
//        String format = String.format("Hours: %tH:%tM:%tS", calendar, calendar, calendar);
//        System.out.println(format);
//        String text = String.format("%-10s %10s %10s", "Left", "Center", "Right");
//        String text1 = String.format("%-10s %10s %10s", "I", "study", "Java");
//
//        System.out.println(text);
//        System.out.println(text1);
//
//        final double PI = 3.1415926321;
//        String format1 = "%f";
//        String s = String.format(format1, PI);
//        System.out.println(s);
//        System.out.printf(format1, PI);
//        System.out.println();
//        System.out.printf(Locale.FRANCE, "%.2e", PI);
//        System.out.println();
//        String text3 = """
//                <Html>
//                    <body>
//                          <p>Hello, world</p>
//                    </body>
//                </Html>     \s
//                """;
//        System.out.println(text3);
//        String pattern = "[Na-z ]+";
//        String text5 = "Now is the time...Not now  L";
//        Pattern p = Pattern.compile(pattern);
//        Matcher m = p.matcher(text5);
//        while (m.find()) {
//            System.out.print(text5.substring(m.start(), m.end()) + "-*-");
//        String pattern = "\\w+(\\.\\w+)*@(\\w+\\.)+\\w+";
//        String text = "my.mail@ua.ua";

        String pattern = "<.*>";
        String text = "<p><b>Beginning with bold text</b> next, text body,<i>italic text</i> end of text.</p>";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        if (m.matches()) {
            System.out.print("Matches the entire text string");
        }
        m.reset();
        System.out.println();
        while (m.find()) {
            System.out.print(text.substring(m.start(), m.end()) + "*");

        }
    }
}