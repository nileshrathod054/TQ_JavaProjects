package arrayListAssignment;

import java.util.*;

public class Q13EmptyArrayList {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Audi");
		cars.add("BMW");
		cars.add("Mercedez");
		cars.add("Volvo");
		cars.add("Ferrari");
		cars.add("Mahindra Thar");
		System.out.println("Elements of arraylist are : " + cars);
		int al_size = cars.size();
		System.out.println("ArrayList consist of " + al_size + " elements");
		//We can make ArrayList empty by 2 methods (1)clear (2)removeAll
		cars.clear();
		//cars.removeAll(cars);
		int new_al_size = cars.size();
		System.out.println("Final arraylist consist of : " + new_al_size + " elements");
	}
}
