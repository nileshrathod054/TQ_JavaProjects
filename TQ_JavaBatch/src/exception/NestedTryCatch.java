package exception;

public class NestedTryCatch {
	public static void main(String[] args) {
		// Outer try block
		try {
			// Inner try block1
			try {
				System.out.println("Inside block1");
				int b = 45 / 0;
				System.out.println(b);
			} catch (ArithmeticException e1) {
				System.out.println("ArithmeticException caught");
			}
			// Inner try block2
			try {
				System.out.println("Inside block2");
				int b = 45 / 0;
				System.out.println(b);
			} catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println("ArrayIndexOutOfBoundsException caught");
			}
			System.out.println("Just an another statement");
		} catch (ArithmeticException e3) {
			System.out.println("ArithmeticException caught");
			System.out.println("Inside Parent try-catch block");
		} catch (ArrayIndexOutOfBoundsException e4) {
			System.out.println("ArrayIndexOutOfBoundsException caught");
			System.out.println("Inside Parent try-catch block");
		} catch (Exception e5) {
			System.out.println("Exception");
			System.out.println("Inside Parent try-catch block");
		}
		System.out.println("Next statement");
	}
}
