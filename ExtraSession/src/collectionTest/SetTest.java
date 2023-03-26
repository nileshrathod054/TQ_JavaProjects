package collectionTest;

import java.util.Iterator;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add("C");
		ts.add("Java");
		ts.add("Collection");
		ts.add("AngularJs");
		ts.add("JQuery");

		Iterator itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
