package array;

public class Maximum {

	public static void main(String[] args) {
		int arr[] = { 34, 45, 67, 39, 56 };

		int max = arr[0];// 34

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("maximum number is.." + max);

	}

}
