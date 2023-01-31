package exception;

public class MultiCatchBlock {
	public static void main(String[] args) {
		try {
			int a[] = new int[7];
			a[8] = 30 / 5;
			System.out.println("Inside try block");

		} catch (ArithmeticException e) {
			System.out.println("Warning: Arithmetic Exception");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Warning: ArrayIndexOutOfBoundsException");
		} catch (Exception e) {
			System.out.println("Warning :Some other exception ");
		}
		System.out.println("Out of try catch block");
	}
}
