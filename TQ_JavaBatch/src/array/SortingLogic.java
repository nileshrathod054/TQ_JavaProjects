package array;

public class SortingLogic {
	void sort(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int a : arr) {
			System.out.println(a);
		}

	}

	public static void main(String[] args) {
		int arr[] = { 34, 45, 67, 39, 56 };
		SortingLogic l = new SortingLogic();
		l.sort(arr);

	}
}
