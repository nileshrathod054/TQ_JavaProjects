package assignment_21stJanString;

public class Q8_RemoveFirstAndLastOccurenceOfWord {
	public static void main(String[] args) {
		String str = "This is Java and Java is object oriented programming language";

		System.out.println("Original String: " + str);

		// Remove first occurrence of word 'Java'
		String modifiedStr = str.replaceFirst("Java", "");

		// Remove last occurrence of word 'Java'
		modifiedStr = modifiedStr.replaceFirst("Java", "");

		System.out.println("\n Modified String: " + modifiedStr);
	}

}
