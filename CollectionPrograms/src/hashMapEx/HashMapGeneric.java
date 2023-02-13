package hashMapEx;

import java.util.HashMap;

public class HashMapGeneric {

	public static void main(String[] args) {

		HashMap hs = new HashMap();

		hs.put("sonal", 12000);
		hs.put(12, 140000);
		hs.put('A', "pass");

		System.out.println(hs);

		HashMap<Integer, String> hs1 = new HashMap<Integer, String>();

		hs1.put(101, "sonal");

		hs1.put(102, "kinjal");
		hs1.put(101, "preeti");

		System.out.println(hs1);

		String s1 = hs1.get(103);
		System.out.println(s1);
	}

}
