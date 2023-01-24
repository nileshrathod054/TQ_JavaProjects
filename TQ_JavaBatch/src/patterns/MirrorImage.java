package patterns;

public class MirrorImage {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int sp = 4; sp >= i; sp--) {

				System.out.print(" ");
			}

			for (int j = 1; j <= 2 * i - 1; j++) {

				System.out.print("*");
			}

			System.out.println("");
		}

		for (int i = 5; i >= 1; i--) {

			for (int sp = 4; sp >= i; sp--) {

				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
