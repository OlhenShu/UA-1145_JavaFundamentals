package edu03.person;

import java.time.Year;


public class Person {
    private String firstName;
    private    String lastName;
private int birthYear;
    public Person() {
    }
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
//Додав конструктор з усіма полями, так як вважаю що доцільніше мати і такий.
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

   public void changeName(String fn, String ln){
       this.firstName = fn;
       this.lastName = ln;
   }
    public int getAge(int getBirthYear) {
      int result=  Year.now().getValue()-getBirthYear;
      return result;
    }
    public String output(){
        return "First Name='" + firstName + '\'' +
                ", Last Name='" + lastName + '\'' +
                ", Birth Year=" + birthYear +'\''+
                ", Age: " + getAge(birthYear);
    }
}
