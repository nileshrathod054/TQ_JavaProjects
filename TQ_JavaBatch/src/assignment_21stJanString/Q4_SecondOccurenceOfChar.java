package assignment_21stJanString;

import java.util.Scanner;

public class Q4_SecondOccurenceOfChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		System.out.println("Enter a character to find the second occurence");
		char ch = sc.next().charAt(0);
//		String str = "Hello World";
//		char ch = 'l';
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
				if (count == 2) {
					System.out.println("Second occurrence of " + ch + " is at index: " + i);
					break;
				}
			}
		}
	}
}
