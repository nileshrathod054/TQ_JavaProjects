package stringAssignment;

public class ToggleCase {
	public static void main(String[] args) {
		String str = "Nilesh Rathod";
		char[] characters = str.toCharArray();
		for (int i = 0; i < characters.length; i++) {
			char ch = characters[i];
			if (Character.isUpperCase(ch)) {
				characters[i] = Character.toLowerCase(ch);
			} else if (Character.isLowerCase(ch)) {
				characters[i] = Character.toUpperCase(ch);
			}
		}
		System.out.println(characters);
	}
}
