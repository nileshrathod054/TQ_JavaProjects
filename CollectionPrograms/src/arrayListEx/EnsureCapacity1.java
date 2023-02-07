package arrayListEx;

import java.util.ArrayList;

public class EnsureCapacity1 {

	public static void main(String[] args) {
		ArrayList<Integer> all = new ArrayList<Integer>(3);
	
		all.add(10);// auto boxing
		all.add(20);
		all.add(30);
		all.add(60);

		all.ensureCapacity(15);
		System.out.println(all.size());
		all.add(50);
		System.out.println(all);

	}

}
