package arrayListEx;

import java.util.ArrayList;

public class GenericArrayListEx {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println(list);
		// list.add("Abhay"); //Compilation error
		list.add(new Integer(56));
		list.add(23);
		list.add((int) 45.56);
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			int data = list.get(i);
			list.set(i, data + 5);

		}
		System.out.println("After adding 5 to each object");
		System.out.println(list);
		// Using for each loop
		System.out.println("Using enhanced for loop");
		for (Integer o : list) {
			System.out.println("Object is : " + o);
		}
	}
}
