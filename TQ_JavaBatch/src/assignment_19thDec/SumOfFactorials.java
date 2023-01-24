package assignment_19thDec;

public class SumOfFactorials {

	public static void main(String[] args) {
		int num = 5;
		int fact = 1;
		int sum = 0;

		// Calcualting the factorials
		for (int i = 1; i <= num; i++) {
			sum = sum + fact;
			fact = fact / i;
		}
		System.out.println("Sum of factorials " + num + " is " + sum);
	}

}
