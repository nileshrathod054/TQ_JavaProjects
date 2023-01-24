package array;

import java.util.Scanner;

public class InsertElement {

	void insert(int arr[], int insert_index, int value, int size) {

		for (int i = arr.length - 2; i >= insert_index; i--) {
			arr[i + 1] = arr[i];
		}
		arr[insert_index] = value;
		size++;

		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("do you want to continue");
		String ans = sc.next();
		if (ans.equals("yes")) {
			System.out.println("Enter index you want to insert");
			insert_index = sc.nextInt();
			System.out.println("Enter value you want to insert");
			value = sc.nextInt();
			insert(arr, insert_index, value, size);
		} else {
			System.exit(0);
		}

		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void main(String[] args) {
		// int arr[]= {11,22,33,44,55};//

		int arr[] = new int[10];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		for (int a : arr) {
			System.out.println(a);
		}
		System.out.println("Enter index you want to insert");
		int insert_index = sc.nextInt();
		System.out.println("Enter value you want to insert");
		int value = sc.nextInt();
		InsertElement i = new InsertElement();
		i.insert(arr, insert_index, value, size);

	}

}
