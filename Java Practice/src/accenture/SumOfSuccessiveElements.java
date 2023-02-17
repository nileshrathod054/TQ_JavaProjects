package accenture;

public class SumOfSuccessiveElements {
	public static int SumSuccessiveElements(int arr[], int len, int n) {
		int sum = 0;
		for (int i = 0; i < len; i = i + n) {
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int len = arr.length;
		int n = 3;
		int sum = SumSuccessiveElements(arr, len, n);
		System.out.println("Sum of successive " + n + "th elements is " + sum);
	}
}
