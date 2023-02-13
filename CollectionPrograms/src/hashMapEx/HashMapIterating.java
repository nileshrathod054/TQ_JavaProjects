package hashMapEx;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapIterating {

	public static void main(String[] args) {
		HashMap<Long, String> hm = new HashMap<>();

		// ArrayList<Long> al=new ArrayList<>();
		hm.put(787878787L, "pooja");
		hm.put(8787878L, "sonal");
		hm.put(98997979l, "kinjal");
		hm.put(898877776L, "pooja");

		System.out.println(hm);

		boolean bool = hm.containsKey(8787878L);
		if (bool == true) {
			System.out.println(hm.get(8787878L));
		}

		// to find keys
		Set<Long> set = hm.keySet();

		Iterator<Long> it = set.iterator();

		while (it.hasNext()) {
			long l = it.next();
			System.out.println(l);

		}

		// to find values

		Collection<String> col = hm.values();

		Iterator<String> it1 = col.iterator();
		while (it1.hasNext()) {
			String s = it1.next();
			System.out.println(s);

		}

		// Entry set

		Set<Entry<Long, String>> set1 = hm.entrySet();

		Iterator<Entry<Long, String>> itt1 = set1.iterator();

		while (itt1.hasNext()) {
			Entry<Long, String> ent = itt1.next();

			System.out.println(ent.getKey() + " " + ent.getValue());
		}

	}

}
