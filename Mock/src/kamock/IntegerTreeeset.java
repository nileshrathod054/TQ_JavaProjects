package kamock;

import java.util.Iterator;
import java.util.TreeSet;

public class IntegerTreeeset {
	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(4);
		ts.add(5);

		Iterator<Integer> it = ts.descendingIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
