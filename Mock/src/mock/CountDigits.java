package mock;

public class CountDigits {
	public static void main(String[] args) {
		String s = "Nilesh1235";
		int count = 0;
		char ch[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (ch[i] > '0' && ch[i] < '9') {

				System.out.print(ch[i] + " ");
				count++;
			}
		}
		System.out.println("\nCount of digits of string=" + count);
	}
}
