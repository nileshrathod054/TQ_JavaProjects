package arrayPractice;

import java.util.Arrays;

public class ShiftOddEven {
	static int[] seperate_odd_even(int arr[]) {
		int left_side = 0, right_side = arr.length - 1;
		while (arr[left_side] < right_side) {
			while (arr[left_side] % 2 == 0) {
				left_side++;
				while (arr[right_side] % 2 == 1) {
					right_side--;
					if (left_side < right_side) {
						int temp = arr[left_side];
						arr[left_side] = arr[right_side];
						arr[right_side] = temp;
						left_side++;
						right_side--;
					}
				}
			}

		}
		return arr;

	}

	public static void main(String[] args) {
		int arr[] = { 20, 12, 23, 17, 7, 8, 9, 10, 1, 0 };
		int result[];
		System.out.println("Original Array : " + Arrays.toString(arr));

		result = seperate_odd_even(arr);
		System.out.println("Array after seperation: " + Arrays.toString(result));
	}
}
