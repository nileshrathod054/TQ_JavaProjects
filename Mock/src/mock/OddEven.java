package mock;

import java.util.Arrays;
import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ei = 0;
		int oi = 1;
		int arr[] = new int[10];
		for (int i = 0; i < 10; i++) {
			int num = sc.nextInt();
			if (num % 2 == 0) {
				arr[ei] = num;
				ei = ei + 2;
			} else {
				arr[oi] = num;
				oi = oi + 2;
			}

		}
		System.out.println(Arrays.toString(arr));
	}
}
