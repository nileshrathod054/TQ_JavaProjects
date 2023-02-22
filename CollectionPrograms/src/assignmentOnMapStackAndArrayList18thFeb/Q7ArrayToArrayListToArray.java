package assignmentOnMapStackAndArrayList18thFeb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q7ArrayToArrayListToArray {
	public static void main(String[] args) {
		// Converting array to ArrayList
		Integer arr[] = { 10, 20, 30, 40 };
		List<Integer> li = Arrays.asList(arr);
		ArrayList<Integer> al = new ArrayList<>(li);
		System.out.println(al);
		al.add(50);
		System.out.println(al);
		// System.out.println(li);
		// Converting ArrayList to array
		ArrayList<Integer> all = new ArrayList<Integer>(3);
		all.add(10);
		all.add(20);
		all.add(30);
		all.add(60);

		Object ar[] = all.toArray();
		System.out.println("Array :");
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(ar[i]+" ");
		}

	}
}
