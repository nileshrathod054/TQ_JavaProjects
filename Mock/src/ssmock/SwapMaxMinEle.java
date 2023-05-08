package ssmock;

//Q2.Create an array and swap max and min number
public class SwapMaxMinEle {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int min = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < arr[min]) {
				min = i;
			}
			if (arr[i] > max) {
				max = i;
			}

		}
		int temp = arr[min];
		arr[min] = arr[max];
		arr[max] = temp;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
