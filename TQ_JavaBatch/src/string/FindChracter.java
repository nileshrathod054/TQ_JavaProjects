package string;

import java.util.Scanner;

public class FindChracter {

	public static void main(String[] args) {
		// String s="India is beautiful country";
		String s = "java progarmming";
		int flag = 0, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character");
		char ch = sc.next().charAt(0);

		char ch1[] = s.toCharArray();

		for (int i = 0; i < ch1.length; i++) {
			if (ch == ch1[i]) {
				flag = 1;
				count++;

			}

		}
		if (flag == 1) {
			System.out.println("Given charcater is present.." + count);
		} else
			System.out.println("not present");

	}

}
