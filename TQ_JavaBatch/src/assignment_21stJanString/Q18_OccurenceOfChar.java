package assignment_21stJanString;

import java.util.Scanner;

public class Q18_OccurenceOfChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.next();
		int[] freq = new int[str.length()];
		char maxChar = str.charAt(0);
		// Convert the given string into character array
		char str1[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			freq[i] = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (str1[i] == str1[j]) {
					freq[i]++;

					// Set str1[j] to 0 to avoid printing visited character
					str1[j] = '0';
				}
			}
		}
		// Displays the characters and their corresponding frequency
		int max = freq[0];

		for (int i = 0; i < freq.length; i++) {

			if (str1[i] != ' ' && str1[i] != '0') {
				System.out.println("Alphabets  Occurence");
				System.out.println(str1[i] + "--------->   " + freq[i]);
			}
			if (max < freq[i]) {
				max = freq[i];
				maxChar = str1[i];
				System.out.println("Alphabet with maximum occurence is = " + maxChar);
			}

		}
		
	}
}
