package edu08;

public class Person {
    private int age;
    private FullName fullName = new FullName();

    public Person(int age) {
        this.age = age;
    }

    public Person(int age, String firstName, String lastName) {
        this.age = age;
        fullName.firstName = firstName;
        fullName.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", fullName=" + fullName +
                '}';
    }

    private class FullName {
        private String firstName;
        private String lastName;

        public FullName() {
        }

        public FullName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public void printInfo() {
            System.out.println("Name " + firstName + " ,lastname " + lastName + " ,age " + age);
        }

        @Override
        public String toString() {
            return "FullName{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }
    }


    public int getAge() {
        return age;
    }

    public FullName getFullName() {
        return fullName;
    }
}

class Demo {
    public static void main(String[] args) {
//        Person person1 = new Person(17);
//        Person.FullName fullPersone = person1.new FullName("Alice", "Green");
//        fullPersone.printInfo();
//        Person.FullName fullPersone2 = new Person(18).new FullName("Bob", " Brown");
//        fullPersone2.printInfo();
        Person person = new Person(18, "Alice", "Green");
        String fullname = String.valueOf(person.getFullName());
        int age = person.getAge();
        System.out.println(person);

        System.out.println(fullname + age);

    }
}