package arrayListEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertingArrayToArrayList {
	public static void main(String[] args) {
		// Converting array to list
		Integer arr[] = { 10, 20, 30, 40 };
		List<Integer> li = Arrays.asList(arr);
		ArrayList al = new ArrayList(li);
		System.out.println(al);
		al.add(50);
		System.out.println(al);
		// System.out.println(li);
		// Converting arraylist to array
		ArrayList<Integer> all = new ArrayList<Integer>(3);
		all.add(10);
		all.add(20);
		all.add(30);
		all.add(60);

		Object ar[] = all.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(ar[i]);
		}
		ArrayList<Integer> al2 = new ArrayList<>();
		System.out.println(al2);
	}
}
