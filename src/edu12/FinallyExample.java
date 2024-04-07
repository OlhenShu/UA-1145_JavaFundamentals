package edu12;

public class FinallyExample {
    public static void main(String[] args) throws InterruptedException {
        String s = greet();
        System.out.println(s);
        foo();
        Thread.sleep(10);
    }

    static String greet() {
        try {
            return "Good morning";
        } finally {
            return "Good evening";
        }
    }

    static String foo() {
        for (int i = 0; i < 5; i++) {
            System.out.println("i" + i);
            try {
                if (i == 3) {
                    break;
                }
                System.exit(0);
            } finally {
                continue;
            }
        }
        return "something";
    }
}
