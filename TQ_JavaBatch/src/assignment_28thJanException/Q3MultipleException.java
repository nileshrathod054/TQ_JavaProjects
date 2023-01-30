package assignment_28thJanException;

public class Q3MultipleException {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };
		try {

			int num1 = 10;
			int num2 = 0;
			int div = num1 / num2; // Arithmetic Exception
			arr[5] = 10; // ArrayIndexOutOfBoundsException
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception Occured: " + e.getMessage());

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Occured: " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Rest of the code");
		}
	}
}
