package exception;

public class InvalidRange extends Exception {
	public void check(int num) throws InvalidRange {
		if (num < 0 || num > 999999) {
			throw new InvalidRange();
		}
	}
	public static void main(String[] args) {
		InvalidRange ir=new InvalidRange();
		try {
			ir.check(999999999);
		} catch (InvalidRange e) {
			System.out.println("Invalid range");
			e.printStackTrace();
		}
	}
}
