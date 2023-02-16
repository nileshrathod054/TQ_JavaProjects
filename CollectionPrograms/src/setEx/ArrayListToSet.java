package setEx;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListToSet {
	public static void main(String[] args) {
		ArrayList<Integer> all = new ArrayList<Integer>();
		all.add(10);// auto boxing
		all.add(20);
		all.add(30);
		all.add(60);
		all.add(10);// auto boxing
		all.add(20);
		all.add(30);
		all.add(60);

		HashSet<Integer> hs = new HashSet<Integer>(all);
		System.out.println(hs);
	}

}
