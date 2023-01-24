package assignment_19thDec;

public class SumOfEvenNum {

	public static void main(String[] args) {

		int n = 10;

		int sum = 10;

		for (int i = 1; i <= n; i++) {

			if (i % 2 == 0) {

				sum = sum + i;

			}

			
		}
		System.out.println("Sum of all even numbers : " + sum);
	}

}
