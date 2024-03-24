package edu06;

public class ClassA {
    public int i = 1;

    public void m1() {
        System.out.println("ClassA, method m1, i = " + i);
    }

    public void m2() {
        System.out.println("ClassA, method m2, i = " + i);
    }

    public void m3() {
        System.out.print("ClassA, method m3, running m4():");
        m4();
    }

    public void m4() {
        System.out.println("ClassA, method m4");
    }

    public void m5() {
        System.out.println("ClassA, method m5, i= " + i);
    }
}
