package edu11;

public class Program {
    public static void main(String[] args) {
        char[] s = {'J', 'a', 'v', 'a'};
        String str = new String(s);    // str = "Java"
        if (!str.isEmpty()) {

            int i = str.length();
            System.out.println(i);
            str = str.toUpperCase();
            System.out.println(str);
            String num = String.valueOf(8);
            num = str.concat("-" + num);
            System.out.println(num);
            char ch = str.charAt(2);
            System.out.println(ch);
            i = str.lastIndexOf('A');
            System.out.println(i);
            num = num.replace("8", "SE");    // num = "JAVA-SE"
            var res = str.substring(0, 4).toLowerCase();
            System.out.println(res);// java
            res = num + "-8";            // str = "JAVA – SE - 8"
            String[] arr = res.split("-");
            for (String w : arr) {
                System.out.println(w);
            }
        }
    }
}
