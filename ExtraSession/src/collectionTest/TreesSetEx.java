package collectionTest;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesSetEx {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add("Jan");
		ts.add("Feb");
		ts.add("Mar");
		ts.add("Apr");
		ts.add("May");

		Iterator it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
