package assignment_21stJanString;

import java.util.Scanner;

public class Q22_SpecialPalindrome {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String str = sc.next();
		str = str.toUpperCase();
		int length = str.length();

		if (str.charAt(0) == str.charAt(length - 1)) {
			boolean isPalindrome = true;
			for (int i = 1; i < length / 2; i++) {
				if (str.charAt(i) != str.charAt(length - 1 - i)) {
					isPalindrome = false;
					break;
				}
			}

			if (isPalindrome) {
				System.out.println("Palindrome");
			} else {
				System.out.println("Special");
			}
		} else {
			System.out.println("Neither Special nor Palindrome");
		}

	}
}
