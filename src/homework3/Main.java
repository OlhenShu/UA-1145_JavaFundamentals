package homework3;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        calculateTheAreaOfTriangle();
        System.out.println();
        smallestNumber();
        System.out.println();
        Employee employee1 = new Employee();
        Employee.promptParameters(employee1);
        employee1.getAge();
        employee1.output();
        Employee employee2 = new Employee();
        Employee.promptParameters(employee2);
        employee2.getAge();
        employee2.output();
        Employee employee3 = new Employee();
        Employee.promptParameters(employee3);
        employee3.getAge();
        employee3.output();
        employee3.changeName("Bob","Bobkiv");
        Employee employee4 = new Employee();
        Employee.promptParameters(employee4);
        employee4.getAge();
        employee4.output();
        Employee employee5 = new Employee();
        Employee.promptParameters(employee5);
        employee5.getAge();
        employee5.output();
    }

    //task1
    public static void calculateTheAreaOfTriangle() {
        System.out.print("Введіть першу сторону трикутника: ");
        double firstNumber = scan.nextDouble();
        System.out.print("Введіть другу сторону трикутника: ");
        double secondNumber = scan.nextDouble();
        System.out.print("Введіть третю сторону трикутника: ");
        double thirdNumber = scan.nextDouble();
        double perimeter = (firstNumber + secondNumber + thirdNumber) / 2;
        double area = Math.sqrt(perimeter * (perimeter - firstNumber) * (perimeter - secondNumber) * (perimeter - thirdNumber));
        System.out.println("Площа трикутника = " + area);
    }

    //task2
    public static void smallestNumber() {
        System.out.print("Введіть перше число: ");
        double firstNumber = scan.nextDouble();
        System.out.print("Введіть друге число: ");
        double secondNumber = scan.nextDouble();
        System.out.print("Введіть третє число: ");
        double thirdNumber = scan.nextDouble();
        if(firstNumber<secondNumber&firstNumber<thirdNumber){
            System.out.println("Перше число найменше");
        } else if (secondNumber<firstNumber&secondNumber<thirdNumber) {
            System.out.println("Друге число найменше");
        } else if (thirdNumber<firstNumber&thirdNumber<secondNumber) {
            System.out.println("Третє число найменше");
        }else{
            System.out.println("Ви ввели не число");
        }
    }
}
