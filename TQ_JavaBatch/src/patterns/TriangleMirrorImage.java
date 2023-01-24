package patterns;

public class TriangleMirrorImage {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			// Columns

			for (int j = 1; j <= i; j++) {

				System.out.print("*" + " ");
			}

			System.out.println(" ");
		}
		for (int i = 5; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print("*" + " ");

			}
			System.out.println(" ");
		}
	}
}
