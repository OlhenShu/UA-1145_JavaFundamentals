package edu08;

public class A {
    private int a = 15;

    public static class B {
        private int b = 10;

        void printInfo(A a) {
            System.out.println(a.a);
        }
    }

    static class C {
        void printInfoB(B b) {
            System.out.println(b.b);
        }
    }
}

class DemoStaticInfo {
    public static void main(String[] args) {
        A a = new A();
        A.B b = new A.B();
        b.printInfo(a);
    }
}