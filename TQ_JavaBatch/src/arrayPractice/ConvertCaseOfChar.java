package arrayPractice;

public class ConvertCaseOfChar {
	public static void main(String args[]) {
		String str = "java is best";
		System.out.println("Original case string is : " + str);
		char strArr[] = str.toCharArray();
		for (int i = 0; i < strArr.length; i++) {

			if (strArr[i] >= 'a' && strArr[i] <= 'z') {
				strArr[i] = (char) ((int) strArr[i] - 32);

			} else if (strArr[i] >= 'A' && strArr[i] <= 'Z') {
				strArr[i] = (char) ((int) strArr[i] + 32);
			}
		}
		System.out.print("Converted case string is : ");
		for (int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i]);
		}
	}
}
