package mapPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IterateHashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> m = new HashMap<>();
		m.put(23, "Kavita");
		m.put(45, "Kishore");
		m.put(89, "Gitanjali");
		m.put(34, "Ram");
		m.put(89, "Rachit");

		System.out.println("Iterating Map using iterator to keySet");
		Set<Integer> s = m.keySet();
		Iterator<Integer> i = s.iterator();
		while (i.hasNext()) {
			Integer key = i.next();
			System.out.println(" key=" + key);
			System.out.println(" Value : " + m.get(key));
		}

		System.out.println("Iterating Map using iterator to Collection using Values().. ");
		Collection list = m.values();
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println("Value is: " + itr.next());
		}
		System.out.println("Iterating Map using iterator to entrySet");
		Set<Map.Entry<Integer, String>> entryset = m.entrySet();
		Iterator<Map.Entry<Integer, String>> itr1 = entryset.iterator();
		while (itr1.hasNext()) {

			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) itr1.next();

			System.out.println("Key=" + entry.getKey() + " Value=" + entry.getValue());
		}
	}
}
