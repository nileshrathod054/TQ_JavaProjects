package patterns;

public class RightAngleTriangle {

	public static void main(String[] args) {
		// Rows
		for (int i = 1; i <= 5; i++) {
			// Columns
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println(" ");
		}
	}

}
