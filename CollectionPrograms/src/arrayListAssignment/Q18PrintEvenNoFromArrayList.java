package arrayListAssignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Q18PrintEvenNoFromArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 1; i <= 50; i++) {
			al.add(i);
		}
		Iterator<Integer> itr = al.iterator();
		System.out.println("The even numbers in the arraylist are : ");
		while (itr.hasNext()) {
			int num = itr.next();
			if (num % 2 == 0) {
				System.out.print(num + " ");
			}
		}
	}
}
