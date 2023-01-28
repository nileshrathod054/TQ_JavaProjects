package assignment_21stJanString;

public class AvgOfDigitsInString {
	public static void main(String[] args) {
		String str = "a5i9gfj4tabc";
		char ch[] = str.toCharArray();
		int sum = 0;
		int num = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 48 && ch[i] <= 57) {
				sum = sum + ch[i] - 48;
				num++;
			}
		}
		float avg = sum / num;
		System.out.println("Average of digits in astring is : " + avg);
	}
}
