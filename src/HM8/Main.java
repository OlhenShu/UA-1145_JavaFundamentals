package HM8;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person(new FullName("Anatoliy", "Nemer"), 80) {
            @Override
            public String activity() {
                return null;
            }
        };
        Student st1 = new Student(new FullName("Oleg", "Sabirov"), 25, 2);
        Student st2 = (Student) st1.clone();
        Student st3 = new Student(new FullName("Andrey", "Sibirkin"), 21, 4);
        st2.setCourse(4);
        System.out.println(person.info() + "\n" + st1.info() + "\n"
                + st1.activity() + "\n" + st2.info() + "\n " + st2.activity()
                + "\n" + st3.info() + "\n" + st3.activity());
    }
}
