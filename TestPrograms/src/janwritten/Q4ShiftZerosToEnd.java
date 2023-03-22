package janwritten;

public class Q4ShiftZerosToEnd {
	public static void main(String[] args) throws Exception {
		int arr[] = { 1, 5, 0, 6, 0, 4 };
		int i = 0;
		System.out.print("Original array: \n");
		for (int n : arr)
			System.out.print(n + "  ");

		for (int j = 0, l = arr.length; j < l;) {
			if (arr[j] == 0)
				j++;
			else {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j++;
			}
		}
		while (i < arr.length)
			arr[i++] = 0;
		System.out.print("\nAfter moving 0's to the end of the array: \n");
		for (int n : arr)
			System.out.print(n + "  ");

	}
}
