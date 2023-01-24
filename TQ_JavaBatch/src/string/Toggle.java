package string;

public class Toggle {

	public static void main(String[] args) {
		String s = "hello java";

		char ch[] = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 90) {
				ch[i] = (char) (ch[i] + 32);
				System.out.print(ch[i]);
			}

			else if (ch[i] >= 97 && ch[i] <= 120) {
				ch[i] = (char) (ch[i] - 32);
				System.out.print(ch[i]);
			} else if (ch[i] == ' ') {

				System.out.print(" ");
			}

		}

	}

}
