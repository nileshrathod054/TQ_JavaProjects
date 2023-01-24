package string;

import java.util.Scanner;

public class PrintNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 1000;

		String str;

		do {
			System.out.println("Enter amount to be deposited");
			int amt = sc.nextInt();
			balance = balance + amt;
			System.out.println("do you want to continue yes/no");
			str = sc.next();

		} while (str.equalsIgnoreCase("yes"));
		System.out.println("balance ..." + balance);
	}

}
