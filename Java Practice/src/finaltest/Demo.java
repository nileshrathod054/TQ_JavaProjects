package finaltest;

//Half array in increasing and half in decreasing
//4,5,7,8 ascending
//6,3,2,1 descending
public class Demo {
	public static void main(String[] args) {
		int arr[] = { 5, 4, 8, 7, 3, 6, 2, 1 };

		int n = arr.length;

		// Sorting the first half in ascending order
		for (int i = 0; i < n / 2; i++) {
			for (int j = i + 1; j < n / 2; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		// Sorting the second half in descending order
		for (int i = n / 2; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("First half of array in ascending and second half of array in descending order");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
