package map_assignment;

public class Q12ReverseString {
	public static void main(String[] args) {
		String s = "Java is a object oriented programming";
		char ch[] = s.toCharArray();

		String rev = "";
		int length = ch.length;
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + ch[i];
		}
		System.out.println(rev);
	}
}
