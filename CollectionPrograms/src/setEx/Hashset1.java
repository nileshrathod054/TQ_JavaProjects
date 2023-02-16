package setEx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Hashset1 {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();

		hs.add(545);
		hs.add(87);
		hs.add(466);
		hs.add(5354);
		hs.add(87);

		System.out.println(hs);
		// hs.remove(87);

		HashSet<Integer> hs1 = new HashSet<>(hs);
		// fail-fast
		Iterator<Integer> it = hs.iterator();

		while (it.hasNext()) {
			Integer i = it.next();
			// it.remove();
			// hs.add(80);
			// hs.remove(87);

		}
		/*
		 * TreeSet<Integer> ts=new TreeSet<>(hs); System.out.println(ts);
		 */

		TreeSet<Integer> ts = new TreeSet<>(new SortingInteger());
		ts.addAll(hs);
		System.out.println(ts);

		Iterator<Integer> it1 = ts.descendingIterator();
		while (it1.hasNext()) {
			Integer i = it1.next();
			System.out.println(i);
			// it.remove();
			// hs.add(80);
			// hs.remove(87);

		}

		System.out.println(ts);

		// System.out.println(hs1);
	}

}
