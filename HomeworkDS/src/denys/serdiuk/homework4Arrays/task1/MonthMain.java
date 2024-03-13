package denys.serdiuk.homework4Arrays.task1;

import java.util.Scanner;

public class MonthMain {

	public static int monthLength(int monthNum) {
		Month[] monthsArray = Month.values();

		for (Month month : monthsArray) {
			if (month.getPosition() == monthNum) {
				return month.getNumDays();
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input the month number");
		int monthNum = scanner.nextInt();
		scanner.close();
		System.out.println("The number of days in " + monthNum + " month is: " + monthLength(monthNum));
	}
}
