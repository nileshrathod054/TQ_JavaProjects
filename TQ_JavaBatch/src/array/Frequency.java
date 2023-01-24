package array;

public class Frequency {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 1, 2, 3, 4, 5, 1, 0 };

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					count++;
					arr[j] = -1;
				}
			}
			if (arr[i] != -1)
				System.out.println(arr[i] + "--->" + count);
		}

	}

}
