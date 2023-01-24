package patterns;

public class AphabetPyramid {

	public static void main(String[] args) {
		char ch = 'A';
		// Rows
		for (int i = 1; i <= 5; i++) {
			// Column
			for (int j = 1; j <= i; j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}

	}

}
