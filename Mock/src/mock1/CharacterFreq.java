package mock1;

import java.util.HashMap;

public class CharacterFreq {
	public static void main(String[] args) {
		String str = "NileshRathod";

		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				int n = map.get(str.charAt(i)) + 1;
				map.put(str.charAt(i), n);
			} else
				map.put(str.charAt(i), 1);

		}
		System.out.println(map);
	}

}
