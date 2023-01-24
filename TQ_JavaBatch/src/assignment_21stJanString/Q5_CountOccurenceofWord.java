package assignment_21stJanString;

import java.util.Scanner;

public class Q5_CountOccurenceofWord {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.nextLine();
		System.out.println("Enter word to find the count ");
		String word = sc.next();
//		String str = "Spring is beautiful but so is winter";
//		String word = "is";
		String temp[] = str.split(" ");
		int count = 0;
		for (int i = 0; i < temp.length; i++) {
			if (word.equals(temp[i]))
				count++;
		}
		System.out.println("The string is: " + str);
		System.out.println("The word " + word + " occurs " + count + " times in the above string");
	}
}
