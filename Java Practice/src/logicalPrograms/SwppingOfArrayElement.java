package logicalPrograms;

public class SwppingOfArrayElement {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int max = arr[0];
		int min = arr[0];
		int maxpos = 0;
		int minpos = 0;
		int i = 0;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				maxpos = i;

			}
			if (arr[i] < min) {
				min = arr[i];
				minpos = i;

			}
		}
		System.out.println("Before swapping : ");
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+" ");
		}
		int temp = arr[maxpos];
		arr[maxpos] = arr[minpos];
		arr[minpos] = temp;
		System.out.println("\nAfter swapping");
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+" ");
		}
	}
}
