public abstract class Person {
    FullName fullName;
    int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public abstract String activity();
    public String info(){
        return "First name:" + fullName.getFirstName() + ", Last name:" + fullName.getLastName() + ", Age:" + age;
    }
}
