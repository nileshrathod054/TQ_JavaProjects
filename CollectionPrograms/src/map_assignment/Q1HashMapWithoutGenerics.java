package map_assignment;

import java.util.HashMap;

public class Q1HashMapWithoutGenerics {
	public static void main(String[] args) {
		HashMap hm1 = new HashMap();
		hm1.put(101, "Nilesh");
		hm1.put(102, "Ashwin");
		hm1.put(103, "Pankaj");
		hm1.put(104, "Shivam");

		System.out.println("First hashmap hm1 : " + hm1);

		HashMap hm2 = new HashMap();
		hm2.put("Nilesh", 101);
		hm2.put("Ashwin", 102);
		hm2.put("Pankaj", 103);
		hm2.put("Shivam", 104);

		System.out.println("Second hashmap hm2 : " + hm2);
	}
}
