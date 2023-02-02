package logicalPrograms;

public class PrimeNumberArray {
	public static void main(String[] args) {
		// Declaring an array of integers
		int[] num = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

		// Loop through each element of the array
		for (int i = 0; i < num.length; i++) {

			// set a flag to 0
			int flag = 0;

			// Loop from 2 to number-1
			for (int j = 2; j < num[i]; j++) {
				// Check if the number is divisible by any number from 2 to number-1
				if (num[i] % j == 0) {
					// If divisible, set flag to 1
					flag = 1;
					break;
				}
			}
			// If flag is 0, number is prime, so print it
			if (flag == 0) {
				System.out.print(num[i] + " ");
			}
		}
	}
}