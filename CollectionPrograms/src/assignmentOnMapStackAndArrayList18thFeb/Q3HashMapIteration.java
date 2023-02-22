package assignmentOnMapStackAndArrayList18thFeb;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Q3HashMapIteration {

	public static void main(String[] args) {

		HashMap<Integer, String> hmap = new HashMap<>();

		hmap.put(1, "Apple");
		hmap.put(2, "Orange");
		hmap.put(3, "Banana");
		hmap.put(4, "Kiwi");
		hmap.put(5, "Mango");

		System.out.println("HashMap: " + hmap);

		// 1. Iterate HashMap using for each loop
		System.out.println("\nIterate using for each loop:");
		for (Map.Entry m : hmap.entrySet()) {
			System.out.println("Key: " + m.getKey() + "  Value: " + m.getValue());
		}

		// 2. Iterate HashMap using Iterator and entrySet
		System.out.println("\nIterate using Iterator:");
		Iterator it = hmap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry m = (Map.Entry) it.next();
			System.out.println("Key: " + m.getKey() + "  Value: " + m.getValue());
		}

		// 3. Iterate HashMap using for loop and keySet
		System.out.println("\nIterate using for loop:");
		for (Integer key : hmap.keySet()) {
			System.out.println("Key: " + key + "  Value: " + hmap.get(key));
		}
		// 4. Iterating HashMap using Collection
		System.out.println("\nIterate HashMap using Collection");
		Collection<String> col = hmap.values();

		Iterator<String> it1 = col.iterator();
		while (it1.hasNext()) {
			String s = it1.next();
			System.out.println(s);

		}
	}
}
