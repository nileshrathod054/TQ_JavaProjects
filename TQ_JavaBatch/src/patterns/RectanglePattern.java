package patterns;

public class RectanglePattern {

	public static void main(String[] args) {
		// Rows
		for (int i = 1; i <= 5; i++) {
			// Columns
			for (int j = 1; j <= 6; j++) {
				System.out.print("*" + " ");
			}
			System.out.println(" ");
		}
	}

}
