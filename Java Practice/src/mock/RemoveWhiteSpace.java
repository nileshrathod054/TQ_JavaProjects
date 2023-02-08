package mock;

public class RemoveWhiteSpace {
	public static void main(String[] args) {

		String s = "  I    am   Nilesh   Rathod  ";

		char[] ch = s.toCharArray();

		char prev = s.charAt(0);

		for (int i = 0; i < ch.length; i++) {
			char cur = ch[i];
			if (cur == ' ' && prev == ' ') {

			} else {
				System.out.print(cur);
			}
			prev = cur;
		}
	}
}
