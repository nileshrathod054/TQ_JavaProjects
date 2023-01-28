package string;

import java.util.regex.Pattern;

public class Matches {

	public static void main(String[] args) {
		String s = "abc";

		// System.out.println(s.matches(".b."));

		System.out.println(Pattern.matches("[^abc]", "b"));
		System.out.println(Pattern.matches("[a-zA-Z]", "a"));

		System.out.println(Pattern.matches("[a-z&&[def]]", "r"));

		System.out.println(Pattern.matches("[a-z&&[^m-p]]", "m"));

		System.out.println(Pattern.matches("^[A-Za-z0-9+@._]+$", "pooh_12@gm.com"));

		System.out.println(String.format("name is %s %s %s", "chennai", "pune", "goa"));
		String str5 = String.format("%06d", 1019);
		System.out.println(str5);
		String str6 = String.format("%d$", 23300);
		System.out.println(str6);
		float f = 45.677766f;
		String str7 = String.format("%.3f", 45.6777);
		System.out.println(str7);

		char[] myStr1 = { 'H', 'e', 'l', 'l', 'o' };
		String myStr2 = " ";
		myStr2 = String.copyValueOf(myStr1, 0, 4);
		System.out.println("Returned String: " + myStr2);

	}

}
