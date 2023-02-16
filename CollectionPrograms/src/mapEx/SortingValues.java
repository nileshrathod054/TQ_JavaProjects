package mapEx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortingValues {

	public static void main(String[] args) {
		HashMap<Integer, String> hs1 = new HashMap<Integer, String>();

		LinkedHashMap<Integer, String> lh = new LinkedHashMap<Integer, String>();
		ArrayList<String> al = new ArrayList<String>();
		hs1.put(105, "sonal");
		hs1.put(102, "kinjal");
		hs1.put(103, "preeti");

		// 1 st step we have to find out values and put in ArrayList

		Collection<String> col = hs1.values();

		Iterator<String> it = col.iterator();

		while (it.hasNext()) {

			al.add(it.next());
		}
		Collections.sort(al);
		Collections.reverse(al);
		System.out.println(al);

		// 2nd Iterate the arraylist and put it in another map

		Iterator<String> it1 = al.iterator();
		while (it1.hasNext()) {
			String s = it1.next();

			Set<Entry<Integer, String>> set = hs1.entrySet();
			for (Map.Entry<Integer, String> map : set) {

				String st = map.getValue();
				if (s.equals(st)) {

					Integer i = map.getKey();

					lh.put(i, st);

				}
			}
		}

		System.out.println(lh);

	}

}
