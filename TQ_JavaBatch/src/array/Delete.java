package array;

public class Delete {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int pos = 1;

		// Output=1 3 4 5

		for (int i = pos; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		int size = arr.length - 1;

		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}

	}

}
