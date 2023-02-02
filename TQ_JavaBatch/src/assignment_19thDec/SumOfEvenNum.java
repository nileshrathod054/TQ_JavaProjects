package assignment_19thDec;

public class SumOfEvenNum {

	public static void main(String[] args) {

		int num[] = {1,2,3,4};

		int sum = 0;

		for (int i = 1; i <= num.length; i++) {

			if (i % 2 == 0) {

				sum = sum + i;

			}

		}
		System.out.println("Sum of all even numbers : " + sum);

	}

}
