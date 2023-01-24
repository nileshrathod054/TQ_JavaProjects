package assignment_21stJanString;

import java.util.Scanner;

public class Q17_LargestSmallestWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.nextLine();
		// String str = "This is an umbrella";
		String[] words = str.split(" ");
		String smallWord = words[0];
		String largeWord = words[0];

		for (int i = 1; i < words.length; i++) {
			if (words[i].length() > largeWord.length()) {
				largeWord = words[i];
			}
			if (words[i].length() < smallWord.length()) {
				smallWord = words[i];
			}
		}
		System.out.println("Smallest word: " + smallWord);
		System.out.println("Largest word : " + largeWord);
	}

}
