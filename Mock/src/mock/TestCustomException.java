package mock;

class InavalidAgeException extends Exception {
	InavalidAgeException() {
		System.out.println("Default constructor");
	}

	InavalidAgeException(String s) {
		super(s);
	}

	@Override
	public String toString() {
		return String.format("InavalidAgeException ");
	}

}

public class TestCustomException {

	static void validate(int age) throws InavalidAgeException {
		if (age < 18)
			throw new InavalidAgeException("You are under age");
		else
			System.out.println("You are eligible to vote");
	}

	public static void main(String[] args) {
		try {
			validate(19);
		} catch (Exception m) {
			System.out.println("Exception occur" + m);
		}
		System.out.println("Rest of the code");
	}
}
