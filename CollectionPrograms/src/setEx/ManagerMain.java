package setEx;

import java.util.HashSet;
import java.util.TreeSet;

public class ManagerMain {

	public static void main(String[] args) {
		Manager m1 = new Manager(1, "pooja", 20000, "mumbai");
		Manager m2 = new Manager(2, "ram", 25000, "mumbai");
		Manager m3 = new Manager(3, "sonali", 30000, "pune");
		Manager m4 = new Manager(4, "kinjal", 15000, "chennai");

		HashSet<Manager> hs = new HashSet();

		hs.add(m1);
		hs.add(m2);
		hs.add(m3);
		hs.add(m4);

		TreeSet<Manager> ts = new TreeSet(hs);
		System.out.println(ts);

		System.out.println("------salary");

		TreeSet<Manager> ts1 = new TreeSet<>(new Manager());
		ts1.addAll(hs);
		System.out.println(ts1);

		System.out.println("-------location");

		TreeSet<Manager> ts2 = new TreeSet(new SortingLocation());
		ts2.addAll(hs);
		System.out.println(ts2);

	}

}
