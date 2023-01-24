package array;

public class SumOfPair {

	public static void main(String[] args) {
		int arr[] = { 4, 6, 5, -10, 8, 5, 20 };
		int sum = 24;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] + arr[j] == sum) {
					System.out.println(arr[i] + " " + arr[j]);
				}
			}
		}

	}

}
