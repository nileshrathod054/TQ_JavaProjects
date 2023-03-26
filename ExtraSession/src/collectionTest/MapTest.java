package collectionTest;

import java.util.HashMap;

public class MapTest {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
	/*	hm.put("C", new Integer(3));
		hm.put("A", new Integer(1));
		hm.put("B", new Integer(2));
		hm.put("A", new Integer(4)); */
	
		hm.put(4, "Grapes");
		hm.put(2, "Banana");
		hm.put(1, "Apple");
		hm.put(3, "Orange");

		System.out.println(hm);
	}
}
