package map_assignment;

import java.util.HashMap;

public class Q4HashMapUsingWrapperClass {
	public static void main(String[] args) {
		HashMap<Character, String> hm = new HashMap<Character, String>();
		hm.put('N', "Nilesh");
		hm.put('A', "Ashwin");
		hm.put('P', "Pankaj");
		hm.put('K', "Khushal");
		hm.put('S', "Shivam");

		System.out.println(hm);
		int size = hm.size();
		System.out.println("Size of map is : " + size);
	}
}
