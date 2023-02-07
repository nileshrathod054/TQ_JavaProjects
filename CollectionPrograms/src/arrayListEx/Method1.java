package arrayListEx;

import java.util.ArrayList;

public class Method1 {

	public static void main(String[] args) {
		// List<Integer> all;
		ArrayList all = new ArrayList<Integer>(3);
		
		all.add(10);// auto boxing
		all.add(20);
		all.add(30);
		all.add(60);
		all.add(2, 100);
		all.add(89);
		all.add(60);

		System.out.println(all);
		int x = all.indexOf(60);
		System.out.println(x);

		int last = all.lastIndexOf(60);
		System.out.println(last);

		System.out.println(all.size());

		all.set(4, 999);
		System.out.println(all);

		all.remove(5);
		System.out.println(all);
		Integer i = 89;
		all.remove(i);

		System.out.println(all);

	}

}
