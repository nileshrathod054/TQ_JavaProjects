package exception;

public class InvalidRange1 extends RuntimeException {

	public void check(int num) {
		if (num < 0 || num > 999999) {

			throw new InvalidRange1();
		}
	}

	public static void main() {

		InvalidRange1 i = new InvalidRange1();
		i.check(999999);
	}

}
