package edu08.nestedclasses1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(new Person.FullName("Jan Pol", "Belmondo"), 120) {
            @Override
            public String activity() {
                return null;
            }
        };

        System.out.println(person.info());
    }
}