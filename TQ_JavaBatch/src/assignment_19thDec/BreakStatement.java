package assignment_19thDec;

public class BreakStatement {

	public static void main(String[] args) {

		// Using for loop

		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				// Breaking the loop
				break;
			}
			System.out.println(i);
		}
	}

}
