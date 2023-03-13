package xobin;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers separated by comma: ");
		String input = sc.nextLine();

		String[] numbers = input.split(",");

		ArrayList<Integer> list = new ArrayList<>();

		for (String number : numbers) {
			int n = Integer.parseInt(number);
			list.add(n);
		}

		System.out.println("Array List with duplicates: " + list);

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) == list.get(j)) {
					list.remove(j);
					j--; // to prevent index out of bounds
				}
			}
		}

		System.out.println("Array List without duplicates: " + list);
	}

}
