package exception;

public class NullPointerExceptionEx {
	public static void main(String[] args) {
		String s = null;
		try {
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("You are dealing with string which has null value");
		}
	}
}
