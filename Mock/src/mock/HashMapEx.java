package mock;

import java.util.HashMap;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		Integer a = hm.put("red", 10);
		a = hm.put("red", 20);
		System.out.println(a);

		System.out.println(hm);
		System.out.println(hm.get("red"));
	}
}
