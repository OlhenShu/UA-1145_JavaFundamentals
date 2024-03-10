package hm3.Person;

import java.util.Calendar;
import java.util.Scanner;

public class Person {
    private String FirstName;
    private String LastName;
    private int BirthYear;

    public Person(String FirstName, String LastName){
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public Person(String FirstName, String LastName, int BirthYear){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.BirthYear = BirthYear;
    }

    public void output(){
        System.out.println("First name: " + FirstName);
        System.out.println("Last name: " + LastName);
        System.out.println("Birth Year: " + BirthYear);
        System.out.println("Age: " + GetAge());
        System.out.println();
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the first name:");
        this.FirstName = scanner.nextLine();
        System.out.println("Input the last name:");
        this.LastName = scanner.nextLine();
        System.out.println("Input the birth year:");
        this.BirthYear = scanner.nextInt();

    }

    public int GetAge(){
        Calendar calendar = Calendar.getInstance();
        int Year = calendar.get(Calendar.YEAR);
        int Age = Year - BirthYear;
        return Age;
    }

    public void ChangeName(String fn, String ln){
        FirstName = fn;
        LastName = ln;
    }

}