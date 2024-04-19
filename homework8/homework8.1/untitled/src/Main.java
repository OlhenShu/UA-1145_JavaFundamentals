public class Main {
    public static void main(String[] args) {
        FullName fullName = new FullName("John", "Doe");
        Person person = new Person(fullName, 30) {
            @Override
            public String activity() {
                return "Working";
            }
        };

        System.out.println(person.info());
        System.out.println("Activity: " + person.activity());
    }
}
