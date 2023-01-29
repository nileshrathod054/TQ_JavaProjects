package arrayPractice;

import java.util.Scanner;

public class PassArrayAsParameter {
	public void findMin(int arr[]) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("Minimum value from an array is : " + min);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter array elements : ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		PassArrayAsParameter obj = new PassArrayAsParameter();
		obj.findMin(a);
	}
}
