package logicalPrograms;

public class CountVowels {
	public static void main(String[] args) {
		String s = "Hello Java";
		int count = 0;
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				count++;
			}
		}
		System.out.println("Number of vowels prsent in a string is : "+count);
	}
}
