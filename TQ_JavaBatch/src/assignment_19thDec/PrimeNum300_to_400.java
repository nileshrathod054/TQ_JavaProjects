package assignment_19thDec;

public class PrimeNum300_to_400 {

	public static void main(String[] args) {

		for (int num = 300; num <= 400; num++) {

			boolean isPrime = true;

			for (int i = 2; i < num; i++) {

				if (num % i == 0) {

					isPrime = false;

					break;
				}

			}

			if (isPrime) {

				System.out.println(num);
			}
		}
	}

}
