package logicalPrograms;

public class DigitsFromString {
	public static void main(String[] args) {
		String s = "abcdes1234";
		char ch[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (ch[i] > '0' && ch[i] < '9') {
				System.out.print(ch[i]);
			}
		}
	}
}
