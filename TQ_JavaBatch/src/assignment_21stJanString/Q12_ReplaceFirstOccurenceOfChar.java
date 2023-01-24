package assignment_21stJanString;

public class Q12_ReplaceFirstOccurenceOfChar {

	public static void main(String[] args) {

		String str = "Hello World";

		// Replace first occurrence of 'H' with 'h'
		String replacedString = str.replaceFirst("H", "h");

		System.out.println("Original String: " + str);
		System.out.println("Replaced String: " + replacedString);
	}
}
