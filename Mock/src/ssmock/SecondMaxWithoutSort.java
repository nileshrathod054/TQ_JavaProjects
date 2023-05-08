package ssmock;

//Q3. Find the second largest element from an array without sorting
public class SecondMaxWithoutSort {
	public static void main(String[] args) {
		int arr[] = { 5, 2, 8, 3, 9, 1 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];

			}
		}
		int secondMax = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != max && arr[i] > secondMax) {
				secondMax = arr[i];
			}
		}
		
		System.out.println("The second largest element : " + secondMax);
	}
}
