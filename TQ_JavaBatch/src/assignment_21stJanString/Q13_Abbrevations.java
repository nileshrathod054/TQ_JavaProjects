package assignment_21stJanString;

import java.util.Scanner;

public class Q13_Abbrevations {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your full name: ");
		String fullName = sc.nextLine();

		String[] names = fullName.split(" ");

		System.out.print(names[0].charAt(0) + ".");
		System.out.print(names[1].charAt(0) + ".");
		System.out.println(names[2]);

		sc.close();
	}
}
