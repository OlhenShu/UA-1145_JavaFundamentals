package denys.serdiuk.homework3;

import java.util.Scanner;

public class Faculty {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Season is: ");
		String seasonName = scanner.next();
		System.out.println("number of students is: ");
		int numStudents = scanner.nextInt();
		
		scanner.close();
		
		switch (seasonName.toLowerCase()) {
		case "autumn":
			Seasons.AUTUMN.setNumStudents(numStudents);
			System.out.println("During " + Seasons.AUTUMN.getName() + " there are " + Seasons.AUTUMN.getNumStudents()
			+ " students studying.");
			break;
		case "winter":
			Seasons.WINTER.setNumStudents(numStudents);
			System.out.println("During " + Seasons.WINTER.getName() + " there are " + Seasons.WINTER.getNumStudents()
			+ " students studying.");
			break; 
		case "spring":
			Seasons.SPRING.setNumStudents(numStudents);
			System.out.println("During " + Seasons.SPRING.getName() + " there are " + Seasons.SPRING.getNumStudents()
			+ " students studying.");
			break;
		case "summer":
			Seasons.SUMMER.setNumStudents(numStudents);
			System.out.println("During " + Seasons.SUMMER.getName() + " there are " + Seasons.SUMMER.getNumStudents()
			+ " students studying.");
			break;
		default:
			System.out.println("Please input the correct value.");
		}
	}

}
