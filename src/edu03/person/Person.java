package edu03.person;

import java.time.Year;


public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Додав конструктор з усіма полями, так як вважаю що доцільніше мати і такий.
    //Yes, it's indeed correct to have such a constructor.
    // The task requested different ones because different scenarios may require different needs.
    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void inputInfo(String line) {

        if (line != null) {
            // Split the line into name, surname and year
            String[] parts = line.split("(,\\s*)|\\s+");
            this.firstName = parts[0];
            this.lastName = parts[1];
            this.birthYear = Integer.parseInt(parts[2]);
        } else {
            System.out.println("No match found");
        }
    }
//    public void inputInfo(String line) {
//        if (line == null) {
//            System.out.println("Input line is null");
//            return;
//        }
//        try {
//            String[] parts = line.split("(,\\s*)|\\s+");
//            if (parts.length != 3) {
//                System.out.println("Invalid input format");
//                return;
//            }
//            this.firstName = parts[0];
//            this.lastName = parts[1];
//            this.birthYear = Integer.parseInt(parts[2]); // This might still throw NumberFormatException
//        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
//            System.out.println("Error parsing input: " + e.getMessage());
//        }
//    }

    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }

    public int getAge(int getBirthYear) {
        int result = Year.now().getValue() - getBirthYear;
        return result;//you need to create a variable 'result' only if it needs to use it in another part of the code.
        // return Year.now().getValue() - getBirthYear; //can be this
    }

    public String output() {
        return "First Name='" + firstName + '\'' +
                ", Last Name='" + lastName + '\'' +
                ", Birth Year=" + birthYear + '\'' +
                ", Age: " + getAge(birthYear);
    }
}
