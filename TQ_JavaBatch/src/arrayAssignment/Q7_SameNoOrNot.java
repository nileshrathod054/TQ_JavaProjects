package arrayAssignment;

public class Q7_SameNoOrNot {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 15, 15, 3, 2 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
				}
			}
		}
	}
}
