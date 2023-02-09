package arrayListEx;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		// hetrogeneous
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(56.5f);
		al.add(44546.67);
		al.add("abc");
		al.add('M');

		System.out.println(al);

		// homogeneous

		ArrayList<Integer> all = new ArrayList<Integer>();
		all.add(10);// auto boxing
		all.add(20);
		all.add(30);
		all.add(60);
		all.add(2, 100);
		all.add(89);

		System.out.println(all);
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(200);
		al2.add(300);

		// all.addAll(al2);

		// System.out.println(all);

		all.addAll(2, al2);

		System.out.println(all);

		System.out.println(all.size());

		all.add(500);
		System.out.println(all);

		System.out.println(all.size());

	}
}
