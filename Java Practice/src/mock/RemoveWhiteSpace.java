package mock;

public class RemoveWhiteSpace {
	public static void main(String[] args) {
		String s = "  I  am  Nilesh  Rathod";
		String s1 = s.trim();
		s1 = s1.replace("  ", " ");
		System.out.println(s1);

	}
}
