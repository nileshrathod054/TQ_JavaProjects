package patterns;

public class NumberPattern1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			for (int sp = 2; sp >= i; sp--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i-1; j++) {
				System.out.print(j);
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}
			System.out.println("");
		}
	}
}
