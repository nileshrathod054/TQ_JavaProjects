package assignment_24thDec;

import java.util.Scanner;

public class SpellingChecker {
	public static void main(String[] args) {
		char ch1, ch2, ch3, ch4, ch5, ch6, ch7;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first letter.");
		ch1 = sc.next().charAt(0);
		System.out.println("Enter the second letter.");
		ch2 = sc.next().charAt(0);
		System.out.println("Enter the third letter.");
		ch3 = sc.next().charAt(0);
		System.out.println("Enter the fourth letter.");
		ch4 = sc.next().charAt(0);
		System.out.println("Enter the fifth letter.");
		ch5 = sc.next().charAt(0);
		System.out.println("Enter the sixth letter.");
		ch6 = sc.next().charAt(0);
		System.out.println("Enter the seventh letter.");
		ch7 = sc.next().charAt(0);
		if (ch1 == 'R' && ch2 == 'A' && ch3 == 'I' && ch4 == 'N' && ch5 == 'B' && ch6 == 'O' && ch7 == 'W') {
			System.out.println("RAINBOW");
		} else
			System.out.println("The spelling is wrong.");

	}
}
