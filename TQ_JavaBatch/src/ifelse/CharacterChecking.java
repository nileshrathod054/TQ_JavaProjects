package ifelse;

public class CharacterChecking {

	public static void main(String[] args) {
		char ch = '{';
		if (ch >= 65 && ch <= 90) {
			System.out.println("It is a capital character");
		} else if (ch >= 97 && ch <= 122) {
			System.out.println("It is a small character");
		} else if (ch >= 48 && ch <= 57) {
			System.out.println("It is a number");
		} else
			System.out.println("It is other symbol");
	}

}
