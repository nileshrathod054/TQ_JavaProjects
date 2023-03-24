package marchWritten;

//7.Print Inverted half pyramid using numbers [1M] 12345 1234 1 2 3 1 2 1
public class Q7InvertedHalfPyramid {
	public static void main(String[] args) {

		for (int i = 5; i > 0; i--) {

			for (int j = 4; j >= i; j--) {
				System.out.print(" ");

			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}
}
