package assignment_14thJan;

public class Q4MinCharacter {
	public static void main(String[] args) {
		char[] arr = { 'A', 'D', 'E', 'x', 'z', 'R' };
		char min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Minimum character in the array is: " + min);
	}
}
