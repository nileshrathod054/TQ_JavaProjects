package logicalPrograms;

public class ReplaceVowelsWithDollar {
	public static void main(String[] args) {
		String s = "Hello Java";
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				ch[i] = '$';

			}

		}
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
	}
}
