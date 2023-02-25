package mock;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CommonCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String s1 = sc.next();
		System.out.println("Enter second string");
		String s2 = sc.next();

		char[] arr1 = s1.replaceAll("\\s", "").toCharArray();
		char[] arr2 = s2.replaceAll("\\s", "").toCharArray();
		Set<Character> ss1 = new TreeSet<>();
		Set<Character> ss2 = new TreeSet<>();

		for (char c : arr1) {
			ss1.add(c);
		}
		for (char c : arr2) {
			ss2.add(c);
		}
		ss1.retainAll(ss2);
		System.out.println("Common characters in alphabetical order are : " + ss1);

	}
}
