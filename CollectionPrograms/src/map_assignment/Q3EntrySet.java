package map_assignment;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Q3EntrySet {
	public static void main(String[] args) {
		HashMap hm1 = new HashMap();
		hm1.put(101, "Nilesh");
		hm1.put(102, "Ashwin");
		hm1.put(103, "Pankaj");
		hm1.put(104, "Shivam");
		hm1.put(104, "Khushal");

		System.out.println(hm1);

		
		//Q4 Key-value Map.Entry
		Set<Entry<Integer, String>> set = hm1.entrySet();
		for (Entry<Integer, String> entry : set) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}
	}
}
