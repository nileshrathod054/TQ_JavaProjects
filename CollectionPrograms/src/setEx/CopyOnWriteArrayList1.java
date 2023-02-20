package setEx;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList1 {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> c = new CopyOnWriteArrayList<>();
		c.add(10);
		c.add(20);
		c.add(30);

		Iterator<Integer> it = c.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
			c.add(40);
		}

		System.out.println(c);

	}

}
