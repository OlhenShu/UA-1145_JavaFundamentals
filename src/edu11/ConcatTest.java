package edu11;

public class ConcatTest {
    public static void main(String[] args) {
        final String repeatedString = "For example, maybe you're interested in finding a particular word, but only if it appears at the beginning or end of a line.";
        long startTime = System.currentTimeMillis();

        StringBuffer sb = new StringBuffer("You can make your pattern matches more precise by specifying such information with boundary matchers.");
        for (int i = 0; i < 100000; i++) {
            sb.append(repeatedString);
        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("You can make your pattern matches more precise by specifying such information with boundary matchers.");
        for (int i = 0; i < 100000; i++) {
            sb2.append(repeatedString);
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        String str1 = "You can make your pattern matches more precise by specifying such information with boundary matchers.";
        String str2 = "For example, maybe you're interested in finding a particular word, but only if it appears at the beginning or end of a line.";
        for (int i = 0; i < 100000; i++) {
            String str3 = str1.concat(str2);
        }
        System.out.println("Time taken by String concat by concat(): " + (System.currentTimeMillis() - startTime) + "ms");
        for (int i = 0; i < 100000; i++) {
            String str4 = str1 + str2;
        }
        System.out.println("Time taken by String concat by + : " + (System.currentTimeMillis() - startTime) + "ms");
    }
}