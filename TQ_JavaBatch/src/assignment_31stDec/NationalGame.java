package assignment_31stDec;

import java.util.Scanner;

public class NationalGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the country name : ");
		String countryName = sc.next();

		switch (countryName) {

		case "India":
			System.out.println("The national game of India is Hockey.");
			break;
		case "China":
			System.out.println("The national game of China is Table Tennis.");
			break;
		case "Bangladesh":
			System.out.println("The national game of Bangladesh is Kabaddi.");
			break;
		case "Italy":
			System.out.println("The national game of Italy is Football.");
			break;
		default:
			System.out.println("Sorry, no national game for this country");

		}
	}
}