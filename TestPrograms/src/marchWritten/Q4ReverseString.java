package marchWritten;

//4.Reverse a string preserving space positions 

public class Q4ReverseString {
	static void reverseString(String input) {

		char[] inputArray = input.toCharArray();
		char[] result = new char[inputArray.length];

		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] == ' ') {
				result[i] = ' ';
			}
		}

		int j = result.length - 1;

		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] != ' ') {
				if (result[j] == ' ') {
					j--;
				}
				result[j] = inputArray[i];
				j--;
			}
		}
		System.out.println(String.valueOf(result));
	}

	public static void main(String[] args) {
		reverseString("Help others");
		reverseString("abc de");
		reverseString("intern at geeks");
	}
}