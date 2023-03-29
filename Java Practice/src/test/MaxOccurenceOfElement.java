package test;

public class MaxOccurenceOfElement {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 2, 3, 4, 5 };

		int max = 0;
		int freq = 0;

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > max) {
				max = count;
				freq = arr[i];
			}
		}
		System.out.println(freq);
	}
}
