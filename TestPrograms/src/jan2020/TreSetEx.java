package jan2020;

import java.util.Iterator;
import java.util.TreeSet;

public class TreSetEx {
	public static void main(String[] args) {
		Emp e1 = new Emp(1, "Nilesh");
		Emp e2 = new Emp(3, "Bhushan");
		Emp e3 = new Emp(4, "Suraj");
		Emp e4 = new Emp(2, "Shankar");

		TreeSet<Emp> ts = new TreeSet<>();
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);

		// System.out.println(ts);

//		Iterator<Emp> itr=ts.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		Iterator<Emp> itr = ts.descendingIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
