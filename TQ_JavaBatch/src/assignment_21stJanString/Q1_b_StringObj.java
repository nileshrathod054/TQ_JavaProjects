package assignment_21stJanString;

public class Q1_b_StringObj {
	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = new String("Java");
		if (s1 == s2) {
			System.out.println("Same reference");
		} else {
			System.out.println("Different reference");
		}
	}
}
