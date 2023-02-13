package map_assignment;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Q7GetOnlyValuesFromHashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		hm1.put(101, "Nilesh");
		hm1.put(102, "Ashwin");
		hm1.put(103, "Pankaj");
		hm1.put(104, "Shivam");

		System.out.println(hm1);

		Collection<String> coll = hm1.values();
		Iterator<String> it = coll.iterator();
		while (it.hasNext()) {
			String val = (String) it.next();
			System.out.println(val);
		}
	}
}
