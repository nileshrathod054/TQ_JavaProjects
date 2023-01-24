package assignment_21stJanString;

public class Q6_UpperToLowerString {
	public static void main(String[] args) {
		String str = "HELLO JAVA";
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 90) {
				ch[i] = (char) (ch[i] + 32);
				System.out.print(ch[i]);
			} else if (ch[i] == ' ') {

				System.out.print(" ");
			}
		}
	}
}
