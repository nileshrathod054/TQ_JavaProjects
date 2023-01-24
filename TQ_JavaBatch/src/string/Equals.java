package string;

public class Equals {

	public static void main(String[] args) {
		String s = "java";
		String s1 = new String("java");

		String s3 = "java";

		if (s.equals(s1)) {
			System.out.println("equal");
		} else
			System.out.println("not equal");

	}

}
