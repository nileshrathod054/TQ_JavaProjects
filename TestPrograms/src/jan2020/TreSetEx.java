package jan2020;

import java.util.Iterator;
import java.util.TreeSet;

public class TreSetEx {
	public static void main(String[] args) {
		Emp e1 = new Emp(1, "Nilesh");
		Emp e5 = new Emp(1, "Nilesh");
		Emp e2 = new Emp(3, "Bhushan");
		Emp e3 = new Emp(4, "Suraj");
		Emp e4 = new Emp(2, "Shankar");
		Emp e6= new Emp(2, "Ganesh");

		TreeSet<Emp> ts = new TreeSet<>();
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		ts.add(e6);

		// System.out.println(ts);
		System.out.println("Employee sorted by id in ascending order");
		Iterator<Emp> itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("\nEmployee sorted by id in descending order");
		Iterator<Emp> itr1 = ts.descendingIterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}
}
