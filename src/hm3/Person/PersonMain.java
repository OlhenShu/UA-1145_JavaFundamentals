package hm3.Person;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person("FName1", "LName2");
        Person person2 = new Person("FName2", "LName2", 2);
        Person person3 = new Person("FName3", "LName3", 3);
        Person person4 = new Person("FName4", "LName4", 4);
        Person person5 = new Person("FName5", "LName5", 5);

        person1.output();
        person2.output();
        person3.output();
        person4.output();
        person5.output();

        person1.input();
        person1.output();

        person2.ChangeName("Sаusage", "Dough");
        person2.output();
    }
}
