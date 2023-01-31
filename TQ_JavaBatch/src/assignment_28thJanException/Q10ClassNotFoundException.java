package assignment_28thJanException;

public class Q10ClassNotFoundException {
	public static void main(String[] args) {
		try {
			Class.forName("ClassNotFoundExceptionExample");
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException has been caught");
		}
	}
}
