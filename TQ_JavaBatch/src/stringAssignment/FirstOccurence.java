package stringAssignment;

public class FirstOccurence {

	public static void main(String[] args) {
		String str = "Hello World";

		char ch = 'o';

		int firstIndex = str.indexOf(ch);

		if (firstIndex == -1)
			System.out.println("Character not found");
		else
			System.out.println("First occurrence of character " + ch + " is found at index " + firstIndex);
	}
}
