package patterns;

public class HousePattern {

	public static void main(String[] args) {
		// First Part
		for (int i = 1; i <= 5; i++) {
			for (int sp = 5; sp >= i; sp--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
				if(j==1 || j==i || i==5) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		// Second Part
		for (int i = 2; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {

				System.out.print(" ");

				if (i == 1 || i == 5 || j == 1 || j == 5) {

					System.out.print("*");

				} else {

					System.out.print(" ");

				}

			}
			System.out.println();
		}
	}
}
