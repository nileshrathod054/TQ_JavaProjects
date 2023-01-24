package patterns;

public class NumberPyramid {

	public static void main(String[] args) {
		// Rows
		for (int i = 1; i <= 5; i++) {
			// Columns
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");

			}
			System.out.println();
		}

	}

}
