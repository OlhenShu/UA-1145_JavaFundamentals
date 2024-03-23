package homework5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static public final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        inputTheNumberOfTheMonth();
//        sumOfTwoUserNumbers();
//        Car[] cars = {
//                new Car("Lamborgini", 2001, 4),
//                new Car("Subaru", 2003, 7),
//                new Car("Sedan", 2002, 9),
//                new Car("Mitcubishi", 2004, 2),
//        };
//        outputTheCarWithYear(cars);
//        int[] arr=generateRandomNumbers(3);
//        guessTheNumber(arr);
    }

    //task1

    public static void inputTheNumberOfTheMonth(){
        System.out.print("Введіть номер місяця (від 1 до 12): ");
        int monthNumber = SCANNER.nextInt();
        if (monthNumber >= 1 && monthNumber <= 12) {
            System.out.println("Кількість днів у цьому місяці: " + DaysOfMonth.daysOfMonth[monthNumber-1]);
        } else {
            System.out.println("Такого місяця не існує");
        }
    }

    //task2

    public static void sumOfTwoUserNumbers() {
        String userAnswer;
        do {
            System.out.print("Введіть перше число: ");
            int firstNumber = SCANNER.nextInt();
            System.out.print("Введіть друге число: ");
            int secondNumber = SCANNER.nextInt();
            SCANNER.nextLine();
            int sumOfTwoNum = firstNumber + secondNumber;
            System.out.println("Сума ваших двох введених чисел = " + sumOfTwoNum);
            System.out.println("Якщо ви хочете повторити операцію введіть yes/no");
            userAnswer = SCANNER.nextLine();
        } while (userAnswer.equals("yes".toLowerCase()));
    }

    //task3

    public static void outputTheCarWithYear(Car[] cars) {
        System.out.println("Введіть рік продукції машини (від 2001 до 2004): ");
        int userAnswer = SCANNER.nextInt();
        boolean found = false;
        for (var car : cars) {
            if (car.getYearOfProduction() == userAnswer) {
                System.out.println(Arrays.toString(new Car[]{car}));
                found = true;
            }
        }
        if (!found) {
            System.out.println("Машин з таким роком продукції немає");
        }
    }

    //task4

    static int[] generateRandomNumbers(int quantity){
        Random rnd = new Random();
        int[] arr = new int[quantity];
        for(int i=0; i<arr.length;i++){
            arr[i]= rnd.nextInt(0,4);
        }return arr;
    }
    public static void guessTheNumber(int[] arr) {
        int userAnswer;
        int numberForGuess = arr[2];
        do {
            System.out.print("Вгадайте число від 1 до 3: ");
            userAnswer = SCANNER.nextInt();
            SCANNER.nextLine();
            if(userAnswer>numberForGuess){
                System.out.println("Too high, try again.");
            } else if (userAnswer<numberForGuess) {
                System.out.println("Too low, try again.");
            }else{
                System.out.println("You are correct");
            }
        } while (userAnswer != arr[2]);
    }
}
