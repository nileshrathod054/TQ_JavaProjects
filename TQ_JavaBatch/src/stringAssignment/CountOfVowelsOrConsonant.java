package stringAssignment;

public class CountOfVowelsOrConsonant {
	public static void main(String[] args) {
		String str = "Nilesh Rathod";
		int vowelsCount = 0;
		int consonantsCount = 0;
		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelsCount++;
			} else if ((ch >= 'a' && ch <= 'z')) {
				consonantsCount++;
			}
		}

		System.out.println("Number of vowels in the string: " + vowelsCount);
		System.out.println("Number of consonants in the string: " + consonantsCount);
	}
}
