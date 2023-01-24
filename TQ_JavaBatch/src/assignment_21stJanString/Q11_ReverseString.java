package assignment_21stJanString;

public class Q11_ReverseString {
	public static void main(String[] args) {
		String str = "dohtaR hseliN";

		StringBuilder s1 = new StringBuilder();

		// append a string into StringBuilder s1
		s1.append(str);

		// reverse StringBuilder s1
		s1.reverse();

		// print reversed String
		System.out.println(s1);
	}
}
