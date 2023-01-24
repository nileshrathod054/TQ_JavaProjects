package loops;

public class WhileloopEx {

	public static void main(String[] args) {

		int num = 521;
		// Printing all the odd numbers between 521 and 229

		while (num >= 229) {

			if (num % 2 != 0) {

				System.out.println(num + "");

			}

			num--;
		}

	}

}
