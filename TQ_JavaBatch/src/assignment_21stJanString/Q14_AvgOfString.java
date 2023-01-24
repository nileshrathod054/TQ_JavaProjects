package assignment_21stJanString;

import java.util.Scanner;

public class Q14_AvgOfString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string : ");
		String str = sc.nextLine();
		int sum = 0;
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				sum =sum+ Integer.parseInt(String.valueOf(str.charAt(i)));
				count++;
			}
		}
		double average = (double) sum / count;
		System.out.println("The average of digits in the string is : " + average);
	}
}
