package edu06;

public class ClassB extends ClassA {
    public double i = 1.1;

    public void m1() {
        System.out.println("ClassB, method m1, i= " + i);
    }

    public void m4() {
        System.out.println("ClassB, method m4" + i);
    }

    public void m5() {
        System.out.println("ClassB, method m5, i= " + i);
    }
}