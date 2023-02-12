package arrayListEx;

import java.util.ArrayList;

public class NonGenericArrayListEx {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		System.out.println(list);
		list.add("Abhay");
		list.add(new Integer(56));
		list.add(23);
		list.add(45.56f);
		list.add(new Item1(111, 550.00f, "Head Phone"));
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		for (int i = 0; i < list.size(); i++) {
			int data = (int) list.get(i);//It throws ClassCastException
			list.set(i, data + 5);
		}
	}
}
