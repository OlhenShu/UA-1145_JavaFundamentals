package homework6.hw6_task2;

public class Main {
    public static void main(String[] args) {
        Developer dev1 = new Developer("Nazar",19, 2000,"Я крутий чувак");
        Employee emp1 = new Employee("Kostia", 23, 3000);
        System.out.println(emp1.report());
        System.out.println(dev1.report());
    }
}
