package mock;

public class Pattern {
	public static void main(String[] args) {
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (j + 97));
			}
			System.out.println();
		}
	}
}
