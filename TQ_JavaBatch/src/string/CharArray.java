package string;

public class CharArray {

	static char[] toCharArray(String s) {
		char[] ch = new char[s.length()];
		for (int i = 0; i < ch.length; i++) {
			ch[i] = s.charAt(i);
		}
		return ch;

	}
}
