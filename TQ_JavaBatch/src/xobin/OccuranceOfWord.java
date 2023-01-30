package xobin;

import java.util.Scanner;

public class OccuranceOfWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputstr = sc.nextLine();
		String searchstr = sc.next();
		int count = 0;
		String a[] = inputstr.split(" ");
		for (String temp : a) {
			if (temp.compareTo(searchstr) == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
