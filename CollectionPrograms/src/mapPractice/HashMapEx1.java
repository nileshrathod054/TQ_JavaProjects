package mapPractice;

import java.util.HashMap;

public class HashMapEx1 {
	public static void main(String[] args) {
		HashMap<Integer, String> m = new HashMap<>();
		System.out.println("Size of map is : " + m.size());
		m.put(23, "Kavita");
		m.put(45, "Kishore");
		m.put(89, "Gitanjali");
		m.put(null, "Rakesh");
		m.put(33, "Gitanjali");
		m.put(100, "null");
		System.out.println("Size of map is : " + m.size());
		System.out.println(m);
		System.out.println("Original value of key 23 : " + m.put(23, "Neeta"));
		System.out.println(m);
		System.out.println("Size of map is : " + m.size());
		System.out.println("Value of key 45 : " + m.get(45));
		System.out.println("Removed " + m.remove(45));
		System.out.println(m);
		System.out.println("Value of null key : " + m.get(null));
		System.out.println("Value of key 100 : " + m.get(100));
		System.out.println("Does map containsKey null? : " + m.containsKey(200)); // ContainsKey cant be null
		System.out.println("Does more than one keys map to Gitanjali ? " + m.containsValue("Gitanjali"));

		m.replace(23, "Nilesh");

		System.out.println(m);

	}
}
