package homework.hw2;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("aba"));
        System.out.println(findIndex(new int[]{1,3,4,7}, 2));
        System.out.println(findDuplicate(new int[]{1,2,3,5,5,6,7}));
        System.out.println(rle("AAVRRREIYEE"));
    }

    public static boolean isPalindrome(String s) {
        int startOfLine = 0;
        int endOfLine = s.length() - 1;

        while (startOfLine < endOfLine) {
            if (s.charAt(startOfLine) != s.charAt(endOfLine)) {
                return false;
            }
            startOfLine++;
            endOfLine--;

        }
        return true;
    }

    public static int findDuplicate(int[] values) {
        int result = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 1; j < values.length; j++) {
                if (values[i] == values[j]) {
                    result =  values[i];
                    break;
                }
            }
        }
        return result;
    }

    public static String rle(String s) {
        StringBuilder result = new StringBuilder();
        char[] dataSet = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            int occurrence = 1;
            while (i + 1 < s.length() && dataSet[i] == dataSet[i + 1]) {
                occurrence++;
                i++;
            }
            result.append(s.charAt(i)).append(occurrence);
        }
        return result.toString();
    }


    public static int findIndex(int[] values, int target) {
        int st = 0;
        int ed = values.length - 1;

        while (st <= ed) {
            int md = st + (ed - st) / 2;
            if (values[md] == target) {
                return md;
            } else if (values[md] > target) {
                ed = md - 1;
            } else {
                st = md + 1;
            }
        }
        return st;
    }
}

