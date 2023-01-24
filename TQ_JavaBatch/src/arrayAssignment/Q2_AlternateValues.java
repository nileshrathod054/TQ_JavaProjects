package arrayAssignment;

public class Q2_AlternateValues {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11 };

		int n = arr.length;

		for (int i = 0; i < n; i = i + 2) {

			System.out.println(arr[i]);
		}
	}

}