package homework4;

import java.util.Scanner;

public class Main {
    static public final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Task1");
        numbersInArea();
        System.out.println("Task2");
        maxAndMinNumbers();
        System.out.println("Task3");
        HTTPError userError = HTTPError.enterYourError();
        System.out.println("З ваших данних у вас помилка: "+userError.errorsType);
        System.out.println("Task4");
        Faculty.Season.infoAboutStudentsAndSemester();
    }

    //task1
    public static void numbersInArea() {
        System.out.print("Введіть перше число:");
        float num1 = SCANNER.nextFloat();
        System.out.print("Введіть друге число:");
        float num2 = SCANNER.nextFloat();
        System.out.print("Введіть третє число:");
        float num3 = SCANNER.nextFloat();
        SCANNER.close();
        if ((num1 >= -5 && num1 <= 5) && (num2 >= -5 && num2 <= 5) && (num3 >= -5 && num3 <= 5)) {
            System.out.println("Цифри введені користувачем входять в межу [-5,5]");
        } else {
            System.out.println("Цифри введені користувачем не входять в межу [-5,5]");
        }
    }

    //task2
    public static void maxAndMinNumbers() {
        System.out.print("Введіть перше число: ");
        double firstNumber = SCANNER.nextDouble();
        System.out.print("Введіть друге число: ");
        double secondNumber = SCANNER.nextDouble();
        System.out.print("Введіть третє число: ");
        double thirdNumber = SCANNER.nextDouble();
        SCANNER.close();
        if (firstNumber < secondNumber & firstNumber < thirdNumber) {
            System.out.println("Перше число найменше");
        } else if (secondNumber < firstNumber & secondNumber < thirdNumber) {
            System.out.println("Друге число найменше");
        } else if (thirdNumber < firstNumber & thirdNumber < secondNumber) {
            System.out.println("Третє число найменше");
        } else {
            System.out.println("Ви ввели не число");
        }
        if (firstNumber > secondNumber & firstNumber > thirdNumber) {
            System.out.println("Перше число найбільше");
        } else if (secondNumber > firstNumber & secondNumber > thirdNumber) {
            System.out.println("Друге число найбільше");
        } else if (thirdNumber > firstNumber & thirdNumber > secondNumber) {
            System.out.println("Третє число найбільше");
        } else {
            System.out.println("Ви ввели не число");
        }
    }

    //task3
    enum HTTPError {
        Error400("Error400"),
        Error401("Error401"),
        Error402("Error402");

        public final String errorsType;

        HTTPError(String errorsType) {
            this.errorsType = errorsType;
        }

        public static HTTPError enterYourError() {
            System.out.println("Введіть ваш номер помилки: ");
            int errorType = SCANNER.nextInt();
            return switch (errorType) {
                case 400 -> Error400;
                case 401 -> Error401;
                case 402 -> Error402;
                default -> throw new IllegalArgumentException("Такої помилки не існує");
            };
        }
    }
    //task4

}

