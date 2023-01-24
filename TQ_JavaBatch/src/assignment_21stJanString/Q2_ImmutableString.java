package assignment_21stJanString;

public class Q2_ImmutableString {
	public static void main(String[] args) {
		String s1 = "Butter";
		String s2 = "fly";
		String s3 = s1.concat(s2); // Concatenating two different strings
		System.out.println("Original String s1 : " + s1);
		System.out.println("Original String s2 : " + s2);
		System.out.println("Concatenated String s3 : " + s3);
	}
}