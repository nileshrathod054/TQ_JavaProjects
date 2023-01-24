package array;

public class SumOfArrayEle {
	public static void main(String[] args) {
		int arr[] = { 3, 5, 15, 4, 4, 15, 5, 3 };// 6 10 30 8
		int flag = 0;
		int count = 0;
		System.out.println("hello");
		for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
			if (arr[i] == arr[j]) {
				flag = 1;
				count++;
			}
		}

		if (flag == 1 && count == arr.length / 2) {
			System.out.println("equal");
		} else
			System.out.println("not equal");

	}

}
