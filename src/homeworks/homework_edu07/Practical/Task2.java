package homeworks.homework_edu07.Practical;

public class Task2 { public static void main(String[] args) {
    Person[] persons = {
            new Teacher("John"),
            new Cleaner("Bob"),
            new Student("Elise"),
    };
    for (var person: persons){
        person.print();
        if (person instanceof Staff staff){
            System.out.println("My salary is " + staff.salary());
        }
    }
}
}

abstract class Person {
    private String name;

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    public abstract void print();
}

abstract class Staff extends Person {
    abstract int salary();

    public Staff(String name) {
        super(name);
    }
}

class Teacher extends Staff {

    private static final String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
        super(name);
    }

    @Override
    int salary() {
        return 10_000;
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }
}

class Cleaner extends Staff {
    private static final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }

    @Override
    int salary() {
        return 5_000;
    }
}

class Student extends Person {
    private static final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON);

    }
}

