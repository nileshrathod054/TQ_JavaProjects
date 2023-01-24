package encapsulation;

public class User {

	public static void main(String[] args) {
		CheckPassword c = new CheckPassword();
		String s1 = c.check();
		System.out.println(c.check());
		if (s1.equals("1234")) {
			System.out.println("Welcome " + c.user);

		} else
			System.out.println("Invalid User");
	}
}
