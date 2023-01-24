package xobin;

import java.util.Scanner;
//5,4,12,8,9,10,43,7,3,1
//1 2 3 4 5 6 7 8 9 13
//1 3 4 5 7 8 9 10 12 43

public class SumAfterSecondMax {
	static int high2;

	static int max(int... arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		high2 = arr[arr.length - 2];
		return high2;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}

		high2 = max(arr);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < high2) {
				sum = sum + arr[i];
			}
		}
		System.out.println(sum);

	}

}
