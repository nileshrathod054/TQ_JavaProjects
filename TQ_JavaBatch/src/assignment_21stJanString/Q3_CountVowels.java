package assignment_21stJanString;

public class Q3_CountVowels {

	public static void main(String[] args) {
		String str = "Life without dreams is like a bird with broken wing, it can't fly";

		// Initializing counters
		int vowels = 0, consonants = 0, digits = 0, spaces = 0;

		// Converting entire string to lower case to simplify
		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
			} else if ((ch >= 'a' && ch <= 'z')) {
				consonants++;
			} else if (ch >= '0' && ch <= '9') {
				digits++;
			} else if (ch == ' ') {
				spaces++;
			}
		}

		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
		System.out.println("Digits: " + digits);
		System.out.println("White spaces: " + spaces);
	}

}
