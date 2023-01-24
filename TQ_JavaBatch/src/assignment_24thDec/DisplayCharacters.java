package assignment_24thDec;

import java.util.Scanner;

public class DisplayCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Digits");
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();

		System.out.println("65-" + (char) A);
		System.out.println("66-" + (char) B);
		System.out.println("67-" + (char) C);
		System.out.println("68-" + (char) D);

	}
}
