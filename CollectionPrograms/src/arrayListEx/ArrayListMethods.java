package arrayListEx;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<Integer> all = new ArrayList<Integer>(3);
		all.add(10);// auto boxing
		all.add(20);
		all.add(30);
		all.add(60);
		all.add(2, 100);
		all.add(89);
		all.add(20);
		all.add(30);
		all.add(60);
		all.add(2, 100);
		all.add(89);

		// all.clear();

		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(10);// auto boxing
		al2.add(20);
		al2.add(899);

		boolean b = all.contains(60);
		if (b == true) {
			System.out.println("element found");
		} else
			System.out.println("element not found");

		boolean b1 = all.containsAll(al2);
		if (b1 == true) {
			System.out.println("given collection found");
		} else

			System.out.println("given collection not found");

		Object o = all.clone();

		System.out.println("---");
		System.out.println(o);

		all.ensureCapacity(-10);

		Integer a = all.get(5);
		System.out.println(a);

		Class c = all.getClass();
		System.out.println(c);

		Method[] m = c.getMethods();

		/*
		 * for(int i=0;i<m.length;i++) { System.out.println(m[i]); }
		 */

		System.out.println(all);

	}

}
