package assignmentOnMapStackAndArrayList18thFeb;

import java.util.HashMap;
import java.util.Scanner;

public class Q5_CharacterFreq {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.next();

		// String s = "pizzapan";

		HashMap<Character, Integer> hm = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			Character ch = s.charAt(i);

			int cnt = 1;

			if (hm.containsKey(ch)) {
				Integer in = hm.get(ch);
				cnt = cnt + 1;

				hm.put(ch, cnt);
			} else {
				hm.put(ch, 1);
			}
		}

		System.out.println(hm);

	}

}
