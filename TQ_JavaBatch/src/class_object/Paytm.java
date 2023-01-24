package class_object;

import java.util.Scanner;

public class Paytm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User ul = new User("Ram", "Pune", 3232, 450);
		ul.print();
		System.out.println("Enter coupon code");
		String s = sc.next();
		int p = ul.getPrice();
		if (s.equals("Gold")) {
			// Equals method will check the character
			System.out.println("Price after discount " + p);

		} else if (s.equals("Silver")) {
			p = p - 30;
			System.out.println("Price after discount " + p);
		} else
			System.out.println("Price is..." + p);
	}
}
