package arrayPractice;

public class LargestNoInArray {
	public static void main(String[] args) {
		int arr[] = { 9, 5, 7, 6, 2, 3, 1 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		System.out.println("Largest no in an array: " + max);
	}
}
