package arrayPractice;

public class SmallestNoInArray {
	public static void main(String[] args) {
		int arr[] = { 1, 4, 2, 3, 6, 9 };
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("Smallest no in an array: " + min);
	}
}
