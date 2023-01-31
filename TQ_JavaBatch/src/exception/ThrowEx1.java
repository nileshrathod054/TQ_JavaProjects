package exception;

public class ThrowEx1 {
	static void throwMethod() throws NullPointerException {
		System.out.println("Inside throw method");
		throw new NullPointerException("Demo");
	}

	public static void main(String[] args) {
		try {
			throwMethod();

		} catch (NullPointerException ex) {
			System.out.println("The exception get caught " + ex);
		}
	}
}
