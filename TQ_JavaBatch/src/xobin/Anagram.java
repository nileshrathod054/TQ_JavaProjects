package xobin;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "keep";
		String s2 = "peek";
		int count = 0;
		int flag = 0;

		// 1. conv. into lowercase

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		// 2. conv. into char..array.

		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();

		// 3. Sort char Array. ch1[]

		for (int i = 0; i < ch1.length; i++) {
			for (int j = 0; j < ch1.length; j++) {
				if (ch1[i] > ch1[j]) {
					char temp = ch1[i];
					ch1[i] = ch1[j];
					ch1[j] = temp;
				}
			}
		}

		// Sort char Array. ch2[]

		for (int i = 0; i < ch2.length; i++) {
			for (int j = 0; j < ch2.length; j++) {
				if (ch2[i] > ch2[j]) {
					char temp = ch2[i];
					ch2[i] = ch2[j];
					ch2[j] = temp;
				}
			}
		}

		// 4. compare to array

		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] == ch2[i]) {
				count++;
				flag = 1;
			}
		}

		if (flag == 1 && count == ch2.length) {
			System.out.println("Anagram");
		} else
			System.out.println("Not Anagram");
	}

}