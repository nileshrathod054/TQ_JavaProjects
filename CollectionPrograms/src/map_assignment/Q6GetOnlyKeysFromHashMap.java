package map_assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Q6GetOnlyKeysFromHashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		hm1.put(101, "Nilesh");
		hm1.put(102, "Ashwin");
		hm1.put(103, "Pankaj");
		hm1.put(104, "Shivam");
		hm1.put(105, "Khushal");

		System.out.println(hm1);

		Set<Integer> keySet = hm1.keySet();
		Iterator<Integer> it = keySet.iterator();
		while (it.hasNext()) {
			Integer key = (Integer) it.next();
			System.out.println(key);
		}
	}
}
