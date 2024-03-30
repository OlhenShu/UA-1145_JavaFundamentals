package Practicals.Pr7.Ex2;

public class Teacher extends Staff {

    @Override
    public void print() {
        System.out.println("I am a teacher");
    }

    @Override
    public void salary() {
        System.out.println("A teacher has high salary");
    }
}
