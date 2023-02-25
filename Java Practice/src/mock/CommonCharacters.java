package mock;

import java.util.Scanner;

public class CommonCharacters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string:");
		String str1 = sc.nextLine();
		System.out.println("Enter second string:");
		String str2 = sc.nextLine();

		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		char[] result = new char[arr1.length];
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					result[count++] = arr1[i];
				}
			}
		}
		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {
				if (result[i] > result[j]) {
					char temp = result[i];
					result[i] = result[j];
					result[j] = temp;
				}
			}
		}
		System.out.println("Common characters in alphabetical order:");
		for (int i = 0; i < count; i++)
			System.out.print(result[i] + " ");
	}
}