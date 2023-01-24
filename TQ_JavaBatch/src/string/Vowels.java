package string;

import java.util.StringJoiner;

public class Vowels {

	public static void main(String[] args) {
		String s = "window";
		String s2 = "Number";

		StringJoiner sj = new StringJoiner(" ");
		sj.add(s);
		sj.add(s2);

		// System.out.println(sj);

		String s3 = sj.toString();

		char arr[] = s3.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' || arr[i] == 'a' || arr[i] == 'e') {

				int x = arr[i];
				System.out.print(arr[i] + "------>" + x);
			}
			System.out.println("");
		}

	}

}
