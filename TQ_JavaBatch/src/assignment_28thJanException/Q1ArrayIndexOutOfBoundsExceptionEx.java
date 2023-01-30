package assignment_28thJanException;

public class Q1ArrayIndexOutOfBoundsExceptionEx {
	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4 };

		// accessing 5th element in an array of size 4.
		System.out.println(arr[4]);
	}
}