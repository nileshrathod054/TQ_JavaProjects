package exception;

public class TryCatchEx {
public static void main(String[] args) {
		int num1, num2;
		try {
			num1 = 2;
			num2 = 62 / num1;
			System.out.println("Try block message");
		} catch (ArithmeticException e) {
			System.out.println("Don't divide a number by zero ");
		}
		System.out.println("I am out of try-catch block");
	}
}
