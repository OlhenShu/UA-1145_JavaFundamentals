package edu03;

//Practical Task2
class PracticalTask2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("Alice");
        employee1.setRate(10);
        employee1.setHours(10);

        Employee employee2 = new Employee("Bob", 10);
        employee2.setHours(10);

        Employee employee3 = new Employee("Jack", 10, 10);

        System.out.println("Empl1 = " + employee1);
        System.out.println("Empl2 = " + employee2);
        System.out.println("Empl3 = " + employee3);

        System.out.println(Employee.getTotalSum());
    }

}
