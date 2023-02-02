package logicalPrograms;

public class InvalidPasswordException extends Exception {
	String username = "nilesh";
	String pass = "nilesh@";

	public void show() throws InvalidPasswordException {
		if (pass.length() < 8) {
			throw new InvalidPasswordException();

		}
	}

	public static void main(String[] args) {
		InvalidPasswordException i = new InvalidPasswordException();
		try {
			i.show();
		} catch (InvalidPasswordException e) {
			e.printStackTrace();
			System.out.println("Invalid Password");
		}
	}
}
